package com.js.ac;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.js.ac.Icecream;

@Component
@Primary
public class ButterScotch implements Icecream{

	public void eat() {
	System.out.println("Eating butterscotch icecream");
	}
	

}
