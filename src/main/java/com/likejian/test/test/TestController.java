package com.likejian.test.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.redis.core.BoundValueOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class TestController {

  private Logger logger = LoggerFactory.getLogger(getClass());

  //  @Autowired private RedisTemplate redisTemplate;

  @Autowired private UserRepository userDao;

  @Autowired TestProperties testProperties;

  //  @Autowired
  //  private JmsMessagingTemplate jmsMessagingTemplate;

  //  @GetMapping("activemq")
  //  public String activemq() {
  //    jmsMessagingTemplate.convertAndSend("test-queue","likejiantest");
  //    return "success";
  //  }
  @Value("${spring.datasource.url}")
  private String value;

  private List<UserEntity> userList = new ArrayList<>();
  private List<Class<?>> clazzList = new ArrayList<>();

  @GetMapping("heap")
  public String heap() {
    boolean flag=true;
    while (flag) {
      userList.add(new UserEntity("likejian"));
    }
    return "";
  }

  @GetMapping("noheap")
  public String noheap() {
    boolean flag=true;
    while (flag) {
      clazzList.addAll(Metaspace.createClass()) ;
    }
    return "";
  }

  @GetMapping("test")
  public String test() {
    logger.warn("likejian --warn ");
    logger.info("likejian --info ");
    //    return "hellowrold" + value;
    try {
      Thread.sleep(1 * 1000L);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    return testProperties.toString();
  }

  @GetMapping("test2")
  public List<UserEntity> test2() {
    PageRequest pageable = PageRequest.of(1, 1, Sort.Direction.DESC, "id");
    Page<UserEntity> users = userDao.findAll(pageable);
    return users.getContent();
  }

  //  @GetMapping("redis")
  //  public List<UserEntity> redis() {
  //    PageRequest pageable = PageRequest.of(1, 1, Sort.Direction.DESC, "id");
  //    Page<UserEntity> users = userDao.findAll(pageable);
  //
  //    BoundValueOperations<String, UserEntity> redis = redisTemplate.boundValueOps("redis");
  //    UserEntity userEntity = redis.get();
  //    if (userEntity == null) {
  //      redis.set(users.getContent().get(0), 10, TimeUnit.MINUTES);
  //      userEntity=redis.get();
  //    }
  //    List<UserEntity> list = new ArrayList(1);
  //    list.add(userEntity);
  //    return list;
  //  }
}
