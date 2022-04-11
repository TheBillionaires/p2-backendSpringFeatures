package com.revature.p2backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.p2backend.model.Bookings;
import com.revature.p2backend.service.BookingsService;

@RestController
public class BookingsController {

	@Autowired
	BookingsService bookingService;
	
	@GetMapping("/bookings")
	public List<Bookings> findAll() {
		// TODO Auto-generated method stub
		return bookingService.findAll();
	}
	@GetMapping("/bookings/{id}")
	public Bookings findById(@PathVariable int id) {
		// TODO Auto-generated method stub
		return bookingService.viewBooking(id);
	}

	@GetMapping("/bookings/paid/{paid}")
	public List<Bookings> findByPaid(@PathVariable boolean paid) {
		// TODO Auto-generated method stub
		return bookingService.findByPaid(paid);
	}

	@GetMapping("/bookings/location/{location}")
	public List<Bookings> findByLocation(@PathVariable String location) {
		// TODO Auto-generated method stub
		return bookingService.findByLocation(location);
	}

	@PostMapping("/bookings")
	public void addBooking(@RequestBody Bookings booking) {
		// TODO Auto-generated method stub
		bookingService.addBooking(booking);
	}

	@PutMapping("/bookings/{id}")
	public void updateBooking(@PathVariable int id, @RequestBody Bookings booking) {
		// TODO Auto-generated method stub
		bookingService.updateBooking(id, booking);
	}
	
	@DeleteMapping("/bookings/{id}")
	public void deleteBooking(@PathVariable int id) {
		// TODO Auto-generated method stub
		bookingService.deleteBooking(id);
	}
}
