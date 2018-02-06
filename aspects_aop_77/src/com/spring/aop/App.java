package com.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/aop/beans.xml");
		
		Blender blender = (Blender) context.getBean("blender");
		blender.blend();		
		
		((IMachine) blender).start();
		
		Fan fan = (Fan) context.getBean("fan");		
		fan.activate(5);
		
		((IMachine) fan).start();

		context.close();

	}

}
