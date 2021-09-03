package com.es_test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.es_test.mapper")
public class EsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EsTestApplication.class, args);
    }

}
