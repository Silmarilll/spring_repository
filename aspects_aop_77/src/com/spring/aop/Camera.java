package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	
	public void snap() {
		System.out.println("SNAP!");
	}
	
	public void snap(int exposure) {
		System.out.println("SNAP! Exposure:" + exposure);
	}
	
	public void snap(String name) {
		System.out.println("SNAP! name:" + name);
	}
	
	public String snapWithReturn(String name) {
		System.out.println("SNAP with return! name:" + name);
		return name;
	}
	
	public void snapNightTime() {
		System.out.println("SNAP night mode!");
	}

}
