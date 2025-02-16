package aop_old2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AopSampleApplicationOld2 implements CommandLineRunner {

	@Autowired
	MyService myService;
	
	public static void main(String[] args) {
		SpringApplication.run(AopSampleApplicationOld2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
      myService.execute();
	}
}
