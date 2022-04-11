package com.revature.p2backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.p2backend.model.Bookings;
import com.revature.p2backend.repo.BookingsRepos;

@Service
public class BookingsServiceImpl implements BookingsService{
	
	@Autowired
	BookingsRepos bookingsRepo;

	@Override
	public List<Bookings> findAll() {
		// TODO Auto-generated method stub
		return bookingsRepo.findAll();
	}

	@Override
	public List<Bookings> findByLocation(String location) {
		// TODO Auto-generated method stub
		return bookingsRepo.findByLocation(location);
	}

	@Override
	public List<Bookings> findByPaid(boolean paid) {
		// TODO Auto-generated method stub
		return bookingsRepo.findByPaid(paid);
	}

	@Override
	public Bookings viewBooking(int id) {
		// TODO Auto-generated method stub
		return bookingsRepo.findById(id).get();
	}

	@Override
	public void addBooking(Bookings booking) {
		// TODO Auto-generated method stub
		bookingsRepo.save(booking);
	}

	@Override
	public void updateBooking(int id, Bookings booking) {
		// TODO Auto-generated method stub
		bookingsRepo.save(booking);
	}

	@Override
	public void deleteBooking(int id) {
		// TODO Auto-generated method stub
		bookingsRepo.deleteById(id);
	}

}
