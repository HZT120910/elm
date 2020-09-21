package com.dongruan.elm;

import com.dongruan.dao.BusinessMapper;
import com.dongruan.dao.CartMapper;

import com.dongruan.service.BusinessServise;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class ElmApplicationTests {
    @Autowired
    DataSource dataSource;

    @Autowired
    BusinessServise businessServise;

    @Test
    void contextLoads() throws SQLException {
        System.out.println(businessServise.showBusinessbyBusinessExplain("各种饺子"));

    }

}
