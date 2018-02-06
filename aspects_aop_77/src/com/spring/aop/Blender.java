package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Blender implements IMachine {

	public void blend() {
		System.out.println("Blending...");
		
	}

}
