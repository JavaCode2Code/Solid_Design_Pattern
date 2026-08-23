package com.scjp.inversion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

//Formats message to JSON format
public class JSonFormatter implements Formatter {

	@Override
	public String formate(Message message) throws FormatException {
		// TODO Auto-generated method stub
		ObjectMapper mapper= new ObjectMapper();
		try {
			return mapper.writeValueAsString(message);
		}
		catch(JsonProcessingException exception){
			exception.printStackTrace();
			throw new  FormatException(exception);
		}
	
	}

}
