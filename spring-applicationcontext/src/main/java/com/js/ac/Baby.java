package com.js.ac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.js.ac.Icecream;

@Component
public class Baby {
	
	@Autowired
	Icecream icecream;

}
