package com.likejian.test.test.dubbo;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;

/**
 * @author likejian
 * @date 2019/6/23
 */
@Component
public class DubboClientService {

  @Reference DubboServie dubboServie;

  public String callDubboService() {
    String hellDubbo = dubboServie.hellDubbo();
    System.out.println(hellDubbo);
    return hellDubbo;
  }
}
