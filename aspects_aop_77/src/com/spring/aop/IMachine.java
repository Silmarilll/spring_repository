package com.spring.aop;

public interface IMachine {
	
	public default void start() {
		System.out.println("Starting ...");
	}


}
