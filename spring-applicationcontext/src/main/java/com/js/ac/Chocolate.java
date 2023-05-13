package com.js.ac;

import org.springframework.stereotype.Component;

import com.js.ac.Icecream;

@Component
public class Chocolate implements Icecream {

	public void eat() {
		System.out.println("Eating chocolate icecream");
		
	}

}
