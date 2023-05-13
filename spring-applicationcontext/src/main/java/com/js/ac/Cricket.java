package com.js.ac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cricket {
	          
	int numberOfPlayers;
	
	String teamName;
	
	int jerseyNumber;

	public Cricket(@Value(value = "20")  int numberOfPlayers,@Value(value = "Shankies") String teamName,@Value(value = "07") int jerseyNumber) {
		this.numberOfPlayers = numberOfPlayers;
		this.teamName = teamName;
		this.jerseyNumber = jerseyNumber;
	}
	
}
