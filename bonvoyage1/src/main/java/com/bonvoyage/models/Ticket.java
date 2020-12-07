package com.bonvoyage.models;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger ticket_id;
	private int number_of_passengers;
	private int[] seat_numbers;
	private String ticket_status;
	
	@OneToOne
	private Route route;
	
	@OneToOne
	private Bus bus;
	
	@OneToOne
	private Users users;
	
	@OneToOne
	private Timetable timetable;
	
	

}
