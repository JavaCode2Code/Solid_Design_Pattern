package com.scjp.segregation;

import java.time.LocalDateTime;

public class User extends Entity {
private String name;
private LocalDateTime lastLoginName;
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the lastLoginName
 */
public LocalDateTime getLastLoginName() {
	return lastLoginName;
}
/**
 * @param lastLoginName the lastLoginName to set
 */
public void setLastLoginName(LocalDateTime lastLoginName) {
	this.lastLoginName = lastLoginName;
}

}
