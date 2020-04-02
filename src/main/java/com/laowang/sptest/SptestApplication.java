package com.laowang.sptest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.laowang.sptest.dao")
@SpringBootApplication
public class SptestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SptestApplication.class, args);
    }
}
