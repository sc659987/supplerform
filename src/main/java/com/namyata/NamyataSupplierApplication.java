package com.namyata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableAutoConfiguration
@SpringBootApplication
public class NamyataSupplierApplication {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(NamyataSupplierApplication.class, args);
    }
}
