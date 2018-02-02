package com.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/beans.xml");
		Camera camera = (Camera) context.getBean("camera");
		Car car = (Car) context.getBean("car");
		
		camera.snap();
		camera.snap(500);
		camera.snapNightTime();

		car.start();


		context.close();

	}

}
