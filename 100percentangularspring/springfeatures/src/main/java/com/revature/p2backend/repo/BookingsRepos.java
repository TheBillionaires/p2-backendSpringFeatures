package com.revature.p2backend.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.p2backend.model.Bookings;

public interface BookingsRepos extends JpaRepository<Bookings, Integer>{

	List<Bookings> findByLocation(String location);
	List<Bookings> findByPaid(boolean paid);
}
