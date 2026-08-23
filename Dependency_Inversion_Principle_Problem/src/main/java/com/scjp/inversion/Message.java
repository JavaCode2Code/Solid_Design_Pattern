package com.scjp.inversion;

import java.time.LocalDateTime;

public class Message {
private String message;
private LocalDateTime timestmp;
public Message(String message) {
	super();
	this.message = message;
}
/**
 * @return the message
 */
public String getMessage() {
	return message;
}
/**
 * @param message the message to set
 */
public void setMessage(String message) {
	this.message = message;
}
/**
 * @return the timestmp
 */
public LocalDateTime getTimestmp() {
	return timestmp;
}
/**
 * @param timestmp the timestmp to set
 */
public void setTimestmp(LocalDateTime timestmp) {
	this.timestmp = timestmp;
}

}
