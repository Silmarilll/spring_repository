package com.spring.aop;

import org.springframework.stereotype.Component;

@Component("camera")
public class Camera implements Machine{
	
	@Deprecated
	public void snap()  {
		System.out.println("SNAP!");
	}
	
	public String snap(String name) {
		System.out.println("SNAP! with name: " + name);
		return name;
	}

	public void snap(int exposure) {
		System.out.println("SNAP! Exposure: " + exposure);	
	}

	public void snapNightTime() {
		System.out.println("SNAP! Night mode");		
	}
	
	public void snapCar(Car car) {
		System.out.println("snap car");
	}

}
