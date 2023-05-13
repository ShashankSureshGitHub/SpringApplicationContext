package com.js.ac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCricket {
	
	public static void main(String[] args) {
	
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
	Cricket c=(Cricket) applicationContext.getBean("cricket");
	System.out.println(c.teamName);
	System.out.println(c.numberOfPlayers);
	System.out.println(c.jerseyNumber);

	}
	
}
