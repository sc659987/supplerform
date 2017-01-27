package com.namyata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class NamyataSupplierApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(NamyataSupplierApplication.class, args);
    }

}
