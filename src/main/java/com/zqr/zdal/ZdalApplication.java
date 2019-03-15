package com.zqr.zdal;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zqr.zdal.dao")
public class ZdalApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZdalApplication.class, args);
    }

}

