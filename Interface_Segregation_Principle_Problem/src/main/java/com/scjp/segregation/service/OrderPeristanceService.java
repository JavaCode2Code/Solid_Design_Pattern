package com.scjp.segregation.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.scjp.segregation.Order;

public class OrderPeristanceService implements PersistanceService<Order> {
	private static final Map<Long, Order> ORDERS = new HashMap<>();

	@Override
	public void save(Order entity) {
		// TODO Auto-generated method stub
		synchronized (ORDERS) {
			ORDERS.put(entity.getId(), entity);
		}
	}

	@Override
	public void delete(Order entity) {
		// TODO Auto-generated method stub
		synchronized (ORDERS) {
			ORDERS.remove(entity.getId());
		}
	}

	@Override
	public Order findById(Long id) {

		// TODO Auto-generated method stub
		synchronized (ORDERS) {
			return ORDERS.get(id);
		}

	}
//Interface violate  Interface Segregation Principle
	@Override
	public List<Order> findByName(String name) {
		// TODO Auto-generated method stub
		 throw new UnsupportedOperationException("Find By Name not supported");
	}

}
