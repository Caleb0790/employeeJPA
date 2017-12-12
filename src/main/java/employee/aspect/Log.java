package employee.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Log {
	
	@AfterReturning( pointcut="execution(* employee.controller.MyController.get())", returning="retVal")
	public void logGet(Object retVal) {
		System.out.println("Aspect log " + retVal);
	}
	
	@Before("execution(* *(..))")
	public void logMethod(JoinPoint pjp) {
		System.out.println("===========================================");
		System.out.println(pjp.getSignature());
	}

	@AfterThrowing(pointcut="execution(* delete())", throwing="e")
	public void logDelete(Exception e) {
		System.out.println("===========================================");
		System.out.println(e.getMessage());
	}
}
