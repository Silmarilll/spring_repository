package com.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/beans.xml");
		Camera camera = (Camera) context.getBean("camera");

		try {
			camera.snap();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception caught");
		}
		System.out.println("-----------");

		context.close();

	}

}
