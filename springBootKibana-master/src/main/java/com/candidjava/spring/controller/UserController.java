package com.candidjava.spring.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.candidjava.spring.bean.User;
import com.candidjava.spring.bean.userList;
import com.candidjava.spring.exception.CustomException;
import com.candidjava.spring.service.UserService;



@RestController
@RequestMapping(value = { "/user" })
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<User> getUserById(@PathVariable("id") String id) throws CustomException  {
        System.out.println("Fetching User with id " + id);
        User output = null;
     
        userList userList = userService.getUserList();
        for (User user : userList.getUserList()){
        	if(user.getUserId().equals(id)) {
        		output = user;
        	}
        }
        	
        if (output==null ) {
        	throw new CustomException("user not found");
           
        	//return new ResponseEntity<User>(output, HttpStatus.BAD_REQUEST);
			
        }
       
        System.out.println("id " + id);
        return new ResponseEntity<User>(output, HttpStatus.OK);
    }
    
	 

	
	
	
	

}
