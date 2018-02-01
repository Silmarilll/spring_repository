package com.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/beans.xml");
		Camera camera = (Camera) context.getBean("camera");
		Lens lens = (Lens) context.getBean("lens");
		camera.snap();
		System.out.println("-----------");
		camera.snap(1000);
		System.out.println("-----------");
		camera.snap("Prague castle");
		System.out.println("-----------");
		camera.snapWithReturn("Josh");
		System.out.println("-----------");
		camera.snapNightTime();
		System.out.println("-----------");
		
		lens.zoom(5);
		context.close();

	}

}
