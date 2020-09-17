package com.dongruan.elm;


import com.dongruan.dao.BusinessMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import javax.sql.DataSource;

@SpringBootApplication
@ComponentScan("com.dongruan")
@MapperScan(value = "com.dongruan.dao")
public class ElmApplication {


    public static void main(String[] args) {
        SpringApplication.run(ElmApplication.class, args);
    }

}
