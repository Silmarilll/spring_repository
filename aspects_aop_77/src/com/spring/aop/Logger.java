package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {
	
	@Pointcut("execution(void com.spring.aop.Camera.snap(..))")
	public void cameraSnap() {	
		//Not executed
		System.out.println("execution of snap");
	}
	
	@Pointcut("execution(* com.spring.aop.Camera.*(..))")
	public void cameraSnap2() {	
		//Not executed
		System.out.println("execution of snap");
	}
	
	@Pointcut("execution(* com.spring.aop.*.*(..))")
	public void cameraRelatedAction() {	
		//Not executed
		System.out.println("execution of snap");
	}
	
	@Pointcut("execution(* *.*(..))")
	public void cameraRelatedActionWithPackage() {	
		//Not executed
		System.out.println("execution of snap");
	}
	
	@Before(value = "execution(void com.spring.aop.Camera.snap())")
	public void aboutToTakePhoto() {
		System.out.println("About to take foto...");
	}
	
	@Before(value = "execution(void com.spring.aop.Camera.snap(String))")
	public void aboutToTakeWithName() {
		System.out.println("About to take foto with name...");
	}
	
	@Before(value = "cameraSnap()")
	public void aboutToTakePhoto2() {
		System.out.println("About to take foto...before cameraSnap()");
	}
	
	@Before(value = "cameraSnap2()")
	public void aboutToTakePhoto3() {
		System.out.println("About to take foto...before cameraSnap() night mode");
	}
	
	@Before(value = "cameraRelatedAction()")
	public void cameraRelatedActionBefore() {
		System.out.println("Doing something related to cameras...");
	}
	
	@Before(value = "cameraRelatedActionWithPackage()")
	public void cameraRelatedActionBefore2() {
		System.out.println("Doing something related to cameras without knowing package...");
	}
	
	@Before(value = "execution(String com.spring.aop.Camera.snapWithReturn(String))")
	public void aboutToTakePhotoWithReturn() {
		System.out.println("About to take foto...before String cameraSnapWithReturn()");
	}
	
	@Before(value = "execution(* com.spring.aop.Camera.snapWithReturn(String))")
	public void aboutToTakePhotoWithReturn2() {
		System.out.println("About to take foto...before String cameraSnapWithReturn()");
	}

}
