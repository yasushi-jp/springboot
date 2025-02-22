package com.example.aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.example.common.MyService;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.common", "com.example.aop"})
public class AopSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplication.class, args);
	}

    @Bean
    CommandLineRunner run(MyService myService) {
        return args -> {
          myService.execute();
        };
    }
}
