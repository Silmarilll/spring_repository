package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("within(com.spring.aop..*)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}
	
	@Pointcut("target(com.spring.aop.Camera)")
	public void targetDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}
	
	@Pointcut("this(com.spring.aop.Camera)")
	public void thisDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}
	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("************Before demo*************");
	}
	
	@Before(value = "targetDemo()")
	public void targetDemoAdvice() {
		System.out.println("************Target demo*************");
	}
	
	@Before(value = "thisDemo()")
	public void thisDemoAdvice() {
		System.out.println("************This demo*************");
	}
}
