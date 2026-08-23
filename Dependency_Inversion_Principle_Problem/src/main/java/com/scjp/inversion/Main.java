package com.scjp.inversion;

import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) throws IOException {
		Message message=new Message("Java is ocean");
		MessagePrinter messagePrinter =new MessagePrinter();
		messagePrinter.writeMessage(message, "properties.txt");
		System.out.println(messagePrinter);
	}

}
