package com.ft.godofmoney.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.ft.godofmoney.service")
@RestController
public class ApplicationBoot {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SpringApplication.run(ApplicationBoot.class, args);
    }

    @RequestMapping("")
    public String hello(){
        return "hello ft";
    }

}
