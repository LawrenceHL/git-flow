package com.example.gitflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitFlowApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitFlowApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "hello git-flow";
    }
}
