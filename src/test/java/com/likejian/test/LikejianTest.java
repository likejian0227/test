package com.likejian.test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author likejian
 * @date 2019/6/26
 */
 class LikejianTest {

     private class Inner{

     }

  public static void add(String args)  {
    args= args+"hello";
  }


    public static int aaa() {
        int x = 1;
        try {
            return 2;
        } finally {
            System.out.println("finally模块被执行");
            return 3;
        }
    }

//    public static void main(String[] args) {
//        Test t = new Test();
//        int y = t.aaa();
//        System.out.println(y);
//    }
  public static void main(String[] args) throws Exception {

//      Class.forName("LikejianTest");
//    Map<String, Object> map = new ConcurrentHashMap();
//    ReentrantLock lock=new ReentrantLock();
//    boolean isLock = lock.tryLock(10, TimeUnit.SECONDS);

//    int i=5;
//
//    int s=(i++)+(++i)+(i--)+(--i);
//    System.out.println(s    );
//    short s1 = 1;
//    s1 += 1;
//    StringBuffer sb=new StringBuffer("zhangsan");
//    add(sb); 编译报错

  }
}
