package com.scjp.opnenclose;

import java.util.List;

public class ISPSubscriber extends Subscriber {

    private long freeUsage;
    
	/**
	 * @return the freeUsage
	 */
	public long getFreeUsage() {
		return freeUsage;
	}

	/**
	 * @param freeUsage the freeUsage to set
	 */
	public void setFreeUsage(long freeUsage) {
		this.freeUsage = freeUsage;
	}
////only for demonstration: Open for Modification
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
