package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ApplicationContext txt = SpringApplication.run(Demo2Application.class, args);
		Hello h = txt.getBean("hello",Hello.class);
		String s = ((Hello) h).gethello("hi");
		System.out.println(s);
	}

}
