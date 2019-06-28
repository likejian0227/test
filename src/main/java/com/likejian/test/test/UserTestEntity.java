package com.likejian.test.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author likejian
 * @date 2019/6/14
 */
@Entity(name = "user_test2")
@Setter
@Getter
@ToString
public class UserTestEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 20)
    private String nameTestGust;
    private String accountRemark;
    private String pwd;
    @Column(length = 20,precision = 4)
    private BigDecimal price;
    @Column(length = 20,scale = 4)
    private BigDecimal price2;
    //正确用法
    @Column(scale = 4,precision = 8)
    private BigDecimal price3;

}
