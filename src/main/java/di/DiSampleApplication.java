package di;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import common.MyService;

@SpringBootApplication
@ComponentScan(basePackages = {"common", "di"})
public class DiSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiSampleApplication.class, args);
	}

    @Bean
    CommandLineRunner run(MyService myService) {
        return args -> {
            myService.execute();
        };
    }

}
