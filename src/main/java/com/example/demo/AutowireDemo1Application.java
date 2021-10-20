package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AutowireDemo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(AutowireDemo1Application.class, args);
	
		Employee e1 = context.getBean(Employee.class);
		e1.test();
	}

}
