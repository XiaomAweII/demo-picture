package com.maxiaowei.mypicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.maxiaowei.mypicturebackend.mapper")
// @EnableAspectJAutoProxy(exposeProxy = true) // 通过 Spring AOP 提供对当前代理对象的访问，使得可以在业务逻辑中访问到当前的代理对象
public class MyPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyPictureBackendApplication.class, args);
    }

}
