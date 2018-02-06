package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	//only doubles (no int)
	@Pointcut("args(Double)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}


// doing matching with cast(snap(int) will be included)	
/*	@Pointcut("args(.., double)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}*/
	
/*	@Pointcut("args(com.spring.aop.Car)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}*/


	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice() {
		System.out.println("************Before demo*************");
	}

}
