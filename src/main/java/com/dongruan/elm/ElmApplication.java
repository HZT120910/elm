package com.dongruan.elm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan("com.dongruan")
@MapperScan(value = "com.dongruan.dao")
public class ElmApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElmApplication.class, args);
    }
}
