package com.likejian.test.test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author likejian
 * @date 2019/6/14
 */
@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByNameAndPwdLike(String name,String pwd);

    @Query("select new UserEntity(p.name) from UserEntity p where p.name=?1 ")
    List<UserEntity> findByName(String name);
}
