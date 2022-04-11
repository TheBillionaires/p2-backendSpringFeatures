package com.revature.p2backend.service;

import java.util.List;
import com.revature.p2backend.model.Bookings;

public interface BookingsService {

	public List<Bookings> findAll();
	
	List<Bookings> findByLocation(String location);
	List<Bookings> findByPaid(boolean paid);
	
	public Bookings viewBooking (int id);
	public void addBooking (Bookings booking);
	public void updateBooking(int id, Bookings booking);
	public void deleteBooking(int id);
}
