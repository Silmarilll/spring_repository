package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("within(com.spring.aop.*)")
	public void cameraSnap() {	
		//Not executed
		System.out.println("pointcut of snap");
	}

	
	@Before(value = "cameraSnap()")
	public void beforeAdvice() {
		System.out.println("************Before advice*************");
	}
}
