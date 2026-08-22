package com.scjp.segregation;

import java.time.LocalDateTime;

public class Order extends Entity {
private LocalDateTime orderPlaceOn;
private Double totalValue;
/**
 * @return the orderPlaceOn
 */
public LocalDateTime getOrderPlaceOn() {
	return orderPlaceOn;
}
/**
 * @param orderPlaceOn the orderPlaceOn to set
 */
public void setOrderPlaceOn(LocalDateTime orderPlaceOn) {
	this.orderPlaceOn = orderPlaceOn;
}
/**
 * @return the totalValue
 */
public Double getTotalValue() {
	return totalValue;
}
/**
 * @param totalValue the totalValue to set
 */
public void setTotalValue(Double totalValue) {
	this.totalValue = totalValue;
}

}
