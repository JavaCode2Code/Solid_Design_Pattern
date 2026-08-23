package com.scjp.inversion;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args) throws IOException {
		Message message=new Message("Java is ocean",LocalDateTime.now());
		MessagePrinter messagePrinter=new MessagePrinter();
		try(PrintWriter printWriter=new PrintWriter(System.out)){
			messagePrinter.writeMessage(message, new JSonFormatter(), printWriter);
			messagePrinter.writeMessage(message, new TextFormatter(), printWriter);

		}
	}

}
