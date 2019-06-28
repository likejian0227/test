package com.likejian.test;

import com.likejian.test.test.UserEntity;
import com.likejian.test.test.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestApplicationTests {

  //    @Test
  //    public void contextLoads() {
  //    }

  @Autowired private UserRepository userDao;

  //    @Before
  //    public void before() {
  //        UserEntity UserEntity = new UserEntity();
  //        UserEntity.setId(1L);
  //        UserEntity.setName("风清扬");
  //        UserEntity.setAccount("fengqy");
  //        UserEntity.setPwd("123456");
  //        userDao.save(UserEntity);
  //        UserEntity = new UserEntity();
  //        UserEntity.setId(3L);
  //        UserEntity.setName("东方不败");
  //        UserEntity.setAccount("bubai");
  //        UserEntity.setPwd("123456");
  //        userDao.save(UserEntity);
  //        UserEntity.setId(5L);
  //        UserEntity.setName("向问天");
  //        UserEntity.setAccount("wentian");
  //        UserEntity.setPwd("123456");
  //        userDao.save(UserEntity);
  //    }
  @Test
  public void findAll() {
          List<UserEntity> byPwd = userDao.findByName("任我行");
          System.out.println(byPwd.toString());
//    System.out.println(userDao.findByName("任我行").toString());
    ;

    //    List<UserEntity> all = userDao.findAll();
    //    System.out.println(all.toString());
    //      UserEntity user = new UserEntity();
    //      user.setPwd("123456");
    // 1.使用 Example。
    // 创建 Example。
    //      Example<UserEntity> userExample = Example.of(user);
    //      Optional<UserEntity> one = userDao.findOne(userExample);
    //      UserEntity foundExampleUser = one.get();
    //      System.out.println(foundExampleUser.toString());
    //      List<UserEntity> list = userDao.findAll(userExample);
    //      System.out.println(list.toString());

    //      UserEntity foundExampleUser = userDao.findOne(userExample);
    // 2.使用 ExampleMatcher。
    // 创建 ExampleMatcher。
    //      ExampleMatcher exampleMatcher = ExampleMatcher.matching()
    //              // 忽略 id 和 createTime 字段。
    //              .withIgnorePaths("id", "createTime")
    //              // 忽略大小写。
    //              .withIgnoreCase()
    //              // 忽略为空字段。
    //              .withIgnoreNullValues();
    //      // 携带 ExampleMatcher。
    //      Example<UserEntity> userExample = Example.of(user, exampleMatcher);
    //      UserEntity userEntity = userDao.findOne(userExample).get();
    //      System.out.println(userEntity.toString());

    //    ExampleMatcher matcher =
    //        ExampleMatcher.matching() // 构建对象
    //            .withMatcher(
    //                "pwd", ExampleMatcher.GenericPropertyMatchers.contains()) // 姓名采用“开始匹配”的方式查询
    //            .withIgnorePaths("id"); // 忽略属性：是否关注。因为是基本类型，需要忽略掉
    //
    //    UserEntity user = new UserEntity();
    //    user.setPwd("123");
    //    // 创建实例
    //    Example<UserEntity> ex = Example.of(user, matcher);
    //    // 查询
    //        List<UserEntity> ls = userDao.findAll(ex);
    //        System.out.println(ls.toString());
//      List<Sort.Order>list=new ArrayList<>();
//      list.add(new Sort.Order(Sort.Direction.DESC,"id"));
//      list.add(new Sort.Order(Sort.Direction.ASC,"account"));
//    System.out.println(userDao.findAll(Sort.by(list)).toString());
//      PageRequest pageable = PageRequest.of(1, 1, Sort.Direction.DESC, "id");
//      Page<UserEntity> users = userDao.findAll(pageable);
//      System.out.println(users.toString());


  }

  @Test
//  @Transactional(rollbackFor = Exception.class)
  public void testAdd() {
    /*UserEntity UserEntity = new UserEntity();
    UserEntity.setId(20L);
    UserEntity.setName("任我行");
    UserEntity.setAccount("renwox");
    UserEntity.setPwd("123456");
    userDao.save(UserEntity);
    UserEntity = new UserEntity();
    UserEntity.setId(20L);
    UserEntity.setName("令狐冲");
    UserEntity.setAccount("linghuc");
    UserEntity.setPwd("123456");
    userDao.save(UserEntity);*/
  }

  //    @After
  //    public void after() {
  //        userDao.deleteById(1L);
  //        userDao.deleteById(3L);
  //        userDao.deleteById(5L);
  //    }

}
