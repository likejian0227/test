package com.likejian.test.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author likejian
 * @date 2019/6/18
 */
@RestController
@RequestMapping("deadlock")
public class DeadLockController {

  public static String obj1 = "obj1";
  public static String obj2 = "obj2";

  @GetMapping("lock")
  public String lock() {
    Thread a = new Thread(new Lock1());
    Thread b = new Thread(new Lock2());
    a.start();
    b.start();
    return "success";
  }
  /*   public static void main(String[] args){
      Thread a = new Thread(new Lock1());
      Thread b = new Thread(new Lock2());
      a.start();
      b.start();
  }*/
}

class Lock1 implements Runnable {
  @Override
  public void run() {
    try {
      System.out.println("Lock1 running");
      while (true) {
        synchronized (DeadLockController.obj1) {
          System.out.println("Lock1 lock obj1");
          Thread.sleep(3000); // 获取obj1后先等一会儿，让Lock2有足够的时间锁住obj2
          synchronized (DeadLockController.obj2) {
            System.out.println("Lock1 lock obj2");
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}

class Lock2 implements Runnable {
  @Override
  public void run() {
    try {
      System.out.println("Lock2 running");
      while (true) {
        synchronized (DeadLockController.obj2) {
          System.out.println("Lock2 lock obj2");
          Thread.sleep(3000);
          synchronized (DeadLockController.obj1) {
            System.out.println("Lock2 lock obj1");
          }
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
