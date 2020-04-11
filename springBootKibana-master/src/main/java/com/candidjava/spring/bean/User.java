package com.candidjava.spring.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class User implements Serializable {

	private String name;
	private String userId;
    private Address address;
    private String roles;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getRoles() {
        return roles;
    }
    public void setRoles(String roles) {
        this.roles = roles;
    }
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public User() {
		
	}
	public User(String name, String userId, Address address, String roles) {
	
		this.name = name;
		this.userId = userId;
		this.address = address;
		this.roles = roles;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", userId=" + userId + ", address=" + address + ", roles=" + roles + "]";
	}
	
	
	
    

}
