package com.spring.aop;

import org.springframework.stereotype.Component;

@Component
public class Fan implements IMachine {

	public void activate(int level) {
		System.out.println("Fan running at level "+ level);		
	}

}
