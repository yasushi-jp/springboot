package aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopSampleApplication {

	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplication.class, args);
	}

    @Bean
    CommandLineRunner run() {
        return args -> {
//            MyService myService = ctx.getBean(MyService.class);
            myService.execute();
        };
    }
}
