package com.taipingyang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan("com.taipingyang.mapper")
public class TUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(TUserApplication.class);
    }
}