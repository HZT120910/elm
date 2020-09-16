package com.dongruan.elm;


import com.dongruan.dao.BusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class ElmApplication {


    public static void main(String[] args) {
        SpringApplication.run(ElmApplication.class, args);
    }

}
