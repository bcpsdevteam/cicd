package com.jenkins.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.logging.Logger;

@SpringBootApplication
public class CicdApplication {

    private static final Logger LOG = Logger.getLogger(String.valueOf(CicdApplication.class));

    @PostConstruct
    public void init() {
        LOG.info("Hello, This is first step for jenkins cicd --2");
    }

    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);
    }

}
