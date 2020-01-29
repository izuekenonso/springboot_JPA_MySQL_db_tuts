package com.example.db.springbootmysql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.springbootmysql.model.Users;
import com.example.db.springbootmysql.repository.UsersRepository;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {
	
	@Autowired
	UsersRepository usersRepository;
	
	@GetMapping(value="/all")
	public List<Users> getAll() {
		return usersRepository.findAll();
	}
	
	@PostMapping(value = "/load")
	public List<Users> persist(@RequestBody Users users) {
		usersRepository.save(users);
		return usersRepository.findAll();
	}
}
