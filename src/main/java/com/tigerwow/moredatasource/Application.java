package com.tigerwow.moredatasource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author wanhu
 * @date 5/25/22 10:25 PM
 */
@SpringBootApplication
@ComponentScan(value = "com.tigerwow.moredatasource.*")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}