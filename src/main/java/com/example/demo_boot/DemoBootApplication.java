package com.example.demo_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 这个类是Springboot的主应用
@SpringBootApplication
public class DemoBootApplication {

    public static void main(String[] args) {
        // 将SpringBoot应用程序启动
        SpringApplication.run(DemoBootApplication.class, args);
    }

}
