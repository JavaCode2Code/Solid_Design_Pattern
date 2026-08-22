package com.scjp.opnenclose;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.scjp.opnenclose.CallHistory.Call;

public class InternetSessionHistory {
	public static class InternetSession {
		private LocalDateTime begin;
		private long dataUsed;
		private Long subscriberId;
		private static final Map<Long, List<InternetSession>> sessions = new HashMap<>();

	public InternetSession(LocalDateTime begin, long dataUsed, Long subscriberId) {
	
		this.begin = begin;
		this.dataUsed = dataUsed;
		this.subscriberId = subscriberId;
	}

		public LocalDateTime getBegin() {
			return begin;
		}

		public void setBegin(LocalDateTime begin) {
			this.begin = begin;
		}

		public long getDataUsed() {
			return dataUsed;
		}

		public void setDataUsed(long dataUsed) {
			this.dataUsed = dataUsed;
		}

		public Long getSubscriberId() {
			return subscriberId;
		}

		public void setSubscriberId(Long subscriberId) {
			this.subscriberId = subscriberId;
		}
		
		public synchronized static List<InternetSession> getCurrentSessions(Long subscriberId){
			if(!sessions.containsKey(subscriberId)) {
				return Collections.EMPTY_LIST;
			}
			return sessions.get(subscriberId);
		}
		
		public synchronized static void addSession(Long subscriberId, LocalDateTime begin,long dataUsed) {
			List<InternetSession> sessionInfo;
			if(!sessions.containsKey(subscriberId)) {
				sessionInfo=new LinkedList<>();
				sessions.put(subscriberId, sessionInfo);
			}
			else {
				sessionInfo=sessions.get(subscriberId);
			}
			sessionInfo.add(new InternetSession(begin, dataUsed, subscriberId));
		}

	}
}
