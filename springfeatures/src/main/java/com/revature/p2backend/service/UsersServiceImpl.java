package com.revature.p2backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p2backend.model.Users;
import com.revature.p2backend.repo.UsersRepos;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	UsersRepos userRepo;

	@Override
	public Users userLogin(String email, String password) {
		// TODO Auto-generated method stub
		return userRepo.getUserByEmailAndPassword(email, password);
	}

	@Override
	public Users userLogout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Users viewUser(String email) {
		// TODO Auto-generated method stub
		return userRepo.getUserByEmail(email);
	}

	@Override
	public void updateUser(int id, Users user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	@Override
	public List<Users> findAll() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void addUser(Users user) {
		// TODO Auto-generated method stub
		userRepo.save(user);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		userRepo.deleteById(id);
	}

}
