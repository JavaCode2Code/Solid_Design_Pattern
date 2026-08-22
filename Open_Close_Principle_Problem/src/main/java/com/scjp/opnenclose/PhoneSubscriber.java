package com.scjp.opnenclose;

import java.util.ArrayList;
import java.util.List;

public class PhoneSubscriber {
	private Long subScriberId;
	private String address;
	private Long phoneNumer;
	private int baseRate;

	public PhoneSubscriber(Long subScriberId, String address, Long phoneNumer, int baseRate) {
		super();
		this.subScriberId = subScriberId;
		this.address = address;
		this.phoneNumer = phoneNumer;
		this.baseRate = baseRate;
	}

	public Long getSubScriberId() {
		return subScriberId;
	}

	public void setSubScriberId(Long subScriberId) {
		this.subScriberId = subScriberId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumer() {
		return phoneNumer;
	}

	public void setPhoneNumer(Long phoneNumer) {
		this.phoneNumer = phoneNumer;
	}

	public int getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}
public double calculateBill() {
	List<CallHistory.Call> session= CallHistory.Call.getCurrentCalla(subScriberId);
	long duration=session.stream().mapToLong(CallHistory.Call::getDuration).sum();
	return duration*baseRate/100;
}
}
