package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	// components arguments
	@Pointcut("bean(camera)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}
	
/*	@Pointcut("bean(*)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}*/


	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("************Before demo*************");
	}

}
