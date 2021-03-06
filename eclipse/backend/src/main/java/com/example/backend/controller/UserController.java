package com.example.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.backend.dao.UserRepository;
import com.example.backend.model.User;



@CrossOrigin(origins = "http: //localhost:3000")
@RestController
public class UserController {
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping ("/users")
	public List<User> listOfUsers(){
		return userRepo.findAll();
	}
	

}
