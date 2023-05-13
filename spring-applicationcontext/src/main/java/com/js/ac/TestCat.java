package com.js.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCat {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		Cat c=(Cat) applicationContext.getBean("cat"); // bean Id created implicitly
		c.sleep();
	}

}
