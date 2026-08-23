package com.scjp.inversion;

import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {
public void writeMessage(Message message, Formatter formatter,PrintWriter printWriter ) throws IOException{
 printWriter.println(formatter.formate(message));
 printWriter.flush();
}
}
