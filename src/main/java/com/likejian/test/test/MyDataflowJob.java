package com.likejian.test.test;

import com.dangdang.ddframe.job.api.ShardingContext;
import com.dangdang.ddframe.job.api.dataflow.DataflowJob;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author likejian
 * @date 2019/6/22
 */
public class MyDataflowJob implements DataflowJob<UserEntity> {

  @Override
  public List<UserEntity> fetchData(ShardingContext shardingContext) {
    List<UserEntity> list = Lists.newArrayList();
    System.out.println("获取数据");
    for (int i = 0; i < 10000; i++) {
      list.add(new UserEntity("likejian" + i));
    }
    return list;
  }

  @Override
  public void processData(ShardingContext shardingContext, List<UserEntity> list) {
      System.out.println("处理数据");
    list.stream()
        .forEach(
            x -> {
                System.out.println(x);
            });
  }
}
