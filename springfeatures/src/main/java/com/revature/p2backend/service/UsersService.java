package com.revature.p2backend.service;

import java.util.List;

import com.revature.p2backend.model.Users;

public interface UsersService {

	public Users userLogin(String email, String password);
	public Users userLogout();
	
	public Users viewUser (String email);
	public void addUser (Users user);
	public void updateUser(int id, Users users);
	public void deleteUser(int id);
	
	public List<Users> findAll();
}
