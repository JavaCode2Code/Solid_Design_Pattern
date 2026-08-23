package com.scjp.inversion;

import java.io.IOException;

public class FormatException extends IOException {

	public FormatException(Exception exception) {
		super(exception);
	}

}
