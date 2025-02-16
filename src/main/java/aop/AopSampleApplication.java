package aop;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AopSampleApplication {

//	@Autowired
//	MyService myService;
	
	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplication.class, args);
	}

    @Bean
    CommandLineRunner run(MyService myService) {
        return args -> {
          myService.execute();
        };
    }

//	@Override
//	public void run(String... args) throws Exception {
//      myService.execute();
//	}
}
