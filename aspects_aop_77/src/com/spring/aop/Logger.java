package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	// components arguments
	@Pointcut("@args(org.springframework.stereotype.Component)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}

	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("************Before demo*************");
	}
/*	
	@Pointcut("@args(java.lang.Deprecated)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}

	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("************Before demo*************");
	}
	
	//only deprecated methods
		
	@Pointcut("@annotation(java.lang.Deprecated)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}

	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("************Before demo*************");
	}
	
	@Pointcut("@target(org.springframework.stereotype.Component)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}

	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("************Before demo*************");
	}
	// you can't use wildcard with within
	
	@Pointcut("within(@org.springframework.stereotype.Component com.spring..*)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}

	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("************Before demo*************");
	}*/

}
