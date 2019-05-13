package com.zyz.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot 应用
 * Created by yongzhou.zhang on 2019/5/13.
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {

        //spring 应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
