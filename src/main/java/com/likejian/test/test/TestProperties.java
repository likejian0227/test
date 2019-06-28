package com.likejian.test.test;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "test")
@PropertySource("classpath:test.properties")
@ToString
@Setter
@Getter
public class TestProperties {
    private String name;
}
