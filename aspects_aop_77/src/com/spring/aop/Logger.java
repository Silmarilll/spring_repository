package com.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("args(exposure, aperture)")
	public void withinDemo(int exposure, double aperture) {	
		//Not executed
		System.out.println("pointcut of snap");
	}
	
	@Pointcut("bean(camera)")
	public void beanCamera() {	
		//Not executed
		System.out.println("pointcut of snap");
	}

	
	@Before(value = "beanCamera() && withinDemo(exposure, aperture)")
	public void withinDemoAdvice(JoinPoint jp, int exposure, double aperture) {
		System.out.println("************Before demo*************");
		System.out.printf("exposure %d, aperture %.2f\n", exposure, aperture);
	}
	
	@After(value = "within(com.spring.aop.*) && !@annotation(Deprecated)")
	public void someAfterAdvice() {
		System.out.println("************After demo*************");
	}
}
