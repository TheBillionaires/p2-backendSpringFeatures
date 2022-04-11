package com.revature.p2backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="booking")
public class Bookings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	@Column(name = "location")
	private String location;
	@Column(name = "description")
	private String description;
	@Column(name = "day")
	private Date day;
	@Column(name = "cost")
	private float cost;
	@Column(name = "paid")
	private boolean paid;
}
