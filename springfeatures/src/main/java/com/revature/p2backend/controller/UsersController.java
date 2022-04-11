package com.revature.p2backend.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2backend.model.Users;
import com.revature.p2backend.service.UsersService;

@RestController
public class UsersController {
	
	public static final Logger logger = LoggerFactory.getLogger(UsersController.class);

	@Autowired
	UsersService userService;
	
	@GetMapping("/users")
	public List<Users> getUsers(){
		return userService.findAll();
	}
	
	@PostMapping("/users")
	public void addUser(@RequestBody Users user) {
		userService.addUser(user);
	}
	
	@PutMapping("/users/{id}")
	public void updateUser(@PathVariable int id, @RequestBody Users user) {
		// TODO Auto-generated method stub
		userService.updateUser(id, user);
	}
	
	@DeleteMapping("/users/{id}")
	public void deleteUser(@PathVariable int id) {
		// TODO Auto-generated method stub
		userService.deleteUser(id);
	}
	
	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
	    model.addAttribute("user", new User());
	     
	    return "signup_form";
	}
	
	/*
	 * @PostMapping("/process_register") public String processRegister(User user) {
	 * BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); String
	 * encodedPassword = passwordEncoder.encode(user.getPassword());
	 * user.setPassword(encodedPassword);
	 * 
	 * usersRepos.save(user);
	 * 
	 * return "register_success"; }
	 */
}
