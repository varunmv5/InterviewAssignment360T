/**
 * 
 */
package com.T.JavaTest.Assignment;

/**
 * @author VARUN V
 *
 */
public class Player1 implements Player {

	/* (non-Javadoc)
	 * @see com.T.JavaTest.Assignment.Player#sendMessage()
	  
	 */
	String msg;
	public void sendMessage(String msg,int counter) {
		
		counter = counter + 1; //Counter incremented for series of communication between player1 and player2
		msg = msg.concat(String.valueOf(counter)); //Concatenating message to counter
		
	}

	/* (non-Javadoc)
	 * @see com.T.JavaTest.Assignment.Player#receiveMessage()
	 */
	public String receiveMessage() 
	{	
        return msg;
	}

	public void sendMessage(String msg) 
	{	
		this.msg = msg;	
	}

}
