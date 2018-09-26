package com.T.JavaTest.Assignment;

/* Interface for player class with sendMessage and receiveMessage method definitions */
public interface Player {
	
/*
	
	Counter initiated to 0 and is a static variable shared for both instances
	of player1 and player2 */
	
	static int counter = 0; 
	
	/* interface method definitions which is implemented by player1 and player2 class */
	
	public void sendMessage(String msg,int counter); 
	
	public void sendMessage(String msg);
	
	public String receiveMessage();
		
}
