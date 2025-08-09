package com.maxiaowei.mypicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.maxiaowei.mypicturebackend.mapper")
public class MyPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPictureBackendApplication.class, args);
    }

}
