package com.example.aop_old1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.common.MyService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.common", "com.example.aop_old1"})
public class AopSampleApplicationOld1 {

	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplicationOld1.class, args);
	}

    @Bean
    CommandLineRunner run() {
        return args -> {
          myService.execute();
        };
    }
}
