package com.spring.aop;

import java.util.stream.Stream;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	//only doubles (no int)
	@Pointcut("bean(camera)")
	public void withinDemo() {	
		//Not executed
		System.out.println("pointcut of snap");
	}

	
	@Before(value = "withinDemo()")
	public void withinDemoAdvice(JoinPoint jp) {
		System.out.println("************Before demo*************");
		Stream.of(jp.getArgs())
		.forEach(arg -> System.out.println("ARG: " + arg));
	}

}
