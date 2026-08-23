package com.scjp.inversion;

public class TextFormatter implements Formatter{

	@Override
	public String formate(Message message) throws FormatException {
		// TODO Auto-generated method stub
		return message.getTimestmp()+":"+message.getMessage();	}
}
