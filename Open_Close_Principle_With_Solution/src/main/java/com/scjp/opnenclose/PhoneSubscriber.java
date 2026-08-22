package com.scjp.opnenclose;

import java.util.List;

public class PhoneSubscriber extends Subscriber {

	
	//only for demonstration: Open for Modification
	@Override
	public double calculateBill() {
		List<CallHistory.Call> session = CallHistory.Call.getCurrentCalla(subscriberId);
		long duration = session.stream().mapToLong(CallHistory.Call::getDuration).sum();
		return duration * baseRate / 100;
	}
}
