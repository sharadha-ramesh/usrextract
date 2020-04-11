package com.candidjava.spring.bean;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

public class userList implements Serializable{
	 @JsonProperty("userList")	
private List<User> userList;


public userList(List<User> userList) {
	
	this.userList = userList;
}


public userList() {
	
}


public List<User> getUserList() {
	return userList;
}

public void setUserList(List<User> userList) {
	this.userList = userList;
}

}
