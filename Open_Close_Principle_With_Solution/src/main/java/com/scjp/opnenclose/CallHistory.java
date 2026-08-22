package com.scjp.opnenclose;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CallHistory {
	public static class Call {
		private LocalDateTime begin;
		private long duration;
		private Long subscriberId;
		private static final Map<Long, List<Call>> calls = new HashMap<>();

		public Call(LocalDateTime begin, long duration, Long subscriberId) {

			this.begin = begin;
			this.duration = duration;
			this.subscriberId = subscriberId;
		}

		public LocalDateTime getBegin() {
			return begin;
		}

		public void setBegin(LocalDateTime begin) {
			this.begin = begin;
		}

		public long getDuration() {
			return duration;
		}

		public void setDuration(long duration) {
			this.duration = duration;
		}

		public Long getSubscriberId() {
			return subscriberId;
		}

		public void setSubscriberId(Long subscriberId) {
			this.subscriberId = subscriberId;
		}
		
		public synchronized static List<Call> getCurrentCalla(Long subscriberId){
			if(!calls.containsKey(subscriberId)) {
				return Collections.EMPTY_LIST;
			}
			return calls.get(subscriberId);
		}
		
		public synchronized static void addSession(Long subscriberId, LocalDateTime begin,long duration) {
			List<Call> calldetails;
			if(!calls.containsKey(subscriberId)) {
				calldetails=new LinkedList<>();
				calls.put(subscriberId, calldetails);
			}
			else {
				calldetails=calls.get(subscriberId);
			}
			calldetails.add(new Call(begin, duration, subscriberId));
		}

	}
}
