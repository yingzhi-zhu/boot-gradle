package com.zhu.bootgradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BootGradleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootGradleApplication.class, args);
    }
    @GetMapping("hello")
    public String helloWorld(){
        return "hello jenkins";
    }

}
