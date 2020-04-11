package com.candidjava.spring.service;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.candidjava.spring.bean.Employee;
import com.candidjava.spring.bean.User;
import com.candidjava.spring.bean.userList;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.dataformat.yaml.snakeyaml.TypeDescription;
import com.fasterxml.jackson.dataformat.yaml.snakeyaml.Yaml;
import com.fasterxml.jackson.dataformat.yaml.snakeyaml.constructor.Constructor;

@Service
public class UserServiceImp implements UserService {


	public userList getUserList() {
		userList user = new userList();
		ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
		mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		try {
			user= mapper.readValue(new File("C:/Users/gbs05614/Downloads/springBootKibana-master/springBootKibana-master/src/main/resources/user.yaml"), new TypeReference<userList>(){});
			System.out.println(user);		
		}
	 	catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}	
		return user;
            
	}



}
