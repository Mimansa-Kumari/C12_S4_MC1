package com.jap.demo;

import com.jap.demo.services.MessageServiceClass;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class, args);
		MessageServiceClass messageServiceClass = applicationContext.getBean("messageServiceClass",MessageServiceClass.class);
		String message = messageServiceClass.method();
		System.out.println(message);
	}

}
