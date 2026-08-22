package com.scjp.segregation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.scjp.segregation.User;

public class UserPersistanceService implements PersistanceService<User> {

	private static final Map<Long, User> USERS = new HashMap<>();

	@Override
	public void save(User entity) {
		synchronized (USERS) {
			USERS.put(entity.getId(), entity);
		}
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(User entity) {
		// TODO Auto-generated method stub
		synchronized (USERS) {
			USERS.remove(entity);
		}

	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		synchronized (USERS) {
			return USERS.get(id);
		}

	}

	
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		synchronized (USERS) {
			return USERS.values().stream().filter(user -> user.getName().equalsIgnoreCase(name))
					.collect(Collectors.toList());
		}

	}

}
