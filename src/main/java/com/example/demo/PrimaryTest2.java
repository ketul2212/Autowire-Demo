package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PrimaryTest2 implements MarkThat{
	public void mark() {
		System.out.println("User 2");
	}
}
