package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("execution(void com.spring.aop.Camera.snap())")
	public void cameraSnap() {	
		//Not executed
		System.out.println("execution of snap");
	}
	
	@Before(value = "execution(void com.spring.aop.Camera.snap())")
	public void aboutToTakePhoto() {
		System.out.println("About to take foto...");
	}
	
	@Before(value = "cameraSnap()")
	public void aboutToTakePhoto2() {
		System.out.println("About to take foto...before cameraSnap()");
	}

}
