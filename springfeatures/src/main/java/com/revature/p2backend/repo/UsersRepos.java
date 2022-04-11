package com.revature.p2backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.p2backend.model.Users;

public interface UsersRepos extends JpaRepository<Users, Integer>{
	public Users getUserByEmailAndPassword(String email, String password);
	public Users getUserByEmail(String email);
}
