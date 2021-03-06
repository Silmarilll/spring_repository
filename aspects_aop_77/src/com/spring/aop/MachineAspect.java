package com.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MachineAspect {
	
	@DeclareParents(value = "com.spring.aop.*", defaultImpl=com.spring.aop.Blender.class)
	private IMachine machine;
	
	@Around(value ="within(com.spring.aop.*)")
	public void runMachine(ProceedingJoinPoint jp) {
		System.out.println("Running...");
		try {
			jp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("...completed");
	}

}
