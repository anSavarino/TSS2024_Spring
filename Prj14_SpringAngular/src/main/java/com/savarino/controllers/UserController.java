package com.savarino.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.savarino.entities.User;
import com.savarino.repos.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserRepository repo;
	
	@GetMapping("users")
	public List<User> getUsers(){
		return (List<User>)repo.findAll();
	}
	
	@PostMapping("users")
	public ResponseEntity<User> addUser(@RequestBody User user) {
		return new ResponseEntity<User> (repo.save(user), HttpStatus.CREATED);
	}
}
