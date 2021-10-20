package com.example.demo;

import org.springframework.stereotype.Component;

@Component(value = "user1")
public class PrimaryTest1 implements MarkThat{
	public void mark() {
		System.out.println("User 1");
	}
}
