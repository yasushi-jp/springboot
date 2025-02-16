package common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Around("execution(* common.MyService.*(..))") // "com.example.service" パッケージ内のすべてのメソッドに適用
	public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {

		System.out.println("[AOP-LOG] Method " + joinPoint.getSignature().getName() + " is starting...");
		long start = System.currentTimeMillis();

		Object result = joinPoint.proceed(); // メソッドを実行

		long elapsedTime = System.currentTimeMillis() - start;
		System.out.println("[AOP-LOG] Method " + joinPoint.getSignature().getName() + " has finished.");

		System.out.println("[AOP-LOG] " + joinPoint.getSignature() + " 実行時間: " + elapsedTime + "ms");

		return result;
	}
}
