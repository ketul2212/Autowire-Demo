package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "singleton")
public class Employee {
	
	@Autowired
	@Qualifier("lap")
	private Laptop laptop;
	
	@Autowired
	@Qualifier("user1")
	private MarkThat mark;
	
	public Employee() {
		super();
		System.out.println("Object is created.....");
	}
	
	public void test() {
		System.out.println("For Testing...");
		laptop.complie();
		mark.mark();
	}
	
	
}
