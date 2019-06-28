package com.likejian.test.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author likejian
 * @date 2019/6/14
 */
@Entity
@Table(name = "test_user")
@Setter
@Getter
@ToString
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GenericGenerator(name = "persistenceGenerator", strategy = "increment")
    private Long id;
    @Column(length = 32)
    private String name;
    @Column(length = 32)
    private String account;
    @Column(length = 64)
    private String pwd;

    public UserEntity() {
    }

    public UserEntity(String name) {
        this.name = name;
    }
}
