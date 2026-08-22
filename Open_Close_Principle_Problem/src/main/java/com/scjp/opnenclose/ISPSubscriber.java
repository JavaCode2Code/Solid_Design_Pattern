package com.scjp.opnenclose;

import java.util.List;

public class ISPSubscriber {
	private Long subscriberId;

    private String address;

    private Long phoneNumber;

    private int baseRate;

    private long freeUsage;

	public ISPSubscriber(Long subscriberId, String address, Long phoneNumber, int baseRate, long freeUsage) {
		super();
		this.subscriberId = subscriberId;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.baseRate = baseRate;
		this.freeUsage = freeUsage;
	}

	public Long getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Long subscriberId) {
		this.subscriberId = subscriberId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getBaseRate() {
		return baseRate;
	}

	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}

	public long getFreeUsage() {
		return freeUsage;
	}

	public void setFreeUsage(long freeUsage) {
		this.freeUsage = freeUsage;
	}
    
	public double calculateBill() {
		List<InternetSessionHistory.InternetSession> sessions= InternetSessionHistory.InternetSession.getCurrentSessions(subscriberId);
		long totalData=sessions.stream().mapToLong(InternetSessionHistory.InternetSession::getDataUsed).sum();
		long chargableData=totalData-freeUsage;
		
		if(chargableData<=0) {
			return 0.0;
		}
		return chargableData*baseRate/100;
	}
}
