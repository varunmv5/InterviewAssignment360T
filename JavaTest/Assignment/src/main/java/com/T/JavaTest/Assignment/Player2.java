/**
 * 
 */
package com.T.JavaTest.Assignment;

/**
 * @author VARUN V
 *
 */
public class Player2 implements Player {

	/* (non-Javadoc)
	 * @see com.T.JavaTest.Assignment.Player#sendMessage()
	 */
	String msg;
	
	public void sendMessage(String msg,int counter) 
	{
		this.msg = msg.concat(String.valueOf(counter));
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
