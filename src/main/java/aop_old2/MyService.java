package aop_old2;

import org.springframework.stereotype.Service;

@Service
public class MyService {

	public void execute() {
        System.out.println("Service is doing executing...");
    }
}
