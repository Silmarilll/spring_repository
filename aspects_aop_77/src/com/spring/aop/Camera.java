package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	public void snap() throws Exception {
		System.out.println("SNAP!");
		throw new Exception("bue!");
	}
	
	public String snap(String name) {
		System.out.println("SNAP! with name: " + name);
		return name;
	}

}
