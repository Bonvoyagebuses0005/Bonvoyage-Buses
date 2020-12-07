package com.bonvoyage.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Seat {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seat_number;
	private String seat_status;
	
	@ManyToOne
	private Bus bus;
	
	@ManyToOne
	private Users users;
	
	public Seat() {
		
	}

	public Seat(int seat_number, String seat_status, Bus bus, Users users) {
		super();
		this.seat_number = seat_number;
		this.seat_status = seat_status;
		this.bus = bus;
		this.users = users;
	}

	public int getSeat_number() {
		return seat_number;
	}

	public void setSeat_number(int seat_number) {
		this.seat_number = seat_number;
	}

	public String getSeat_status() {
		return seat_status;
	}

	public void setSeat_status(String seat_status) {
		this.seat_status = seat_status;
	}

	public Bus getBus() {
		return bus;
	}

	public void setBus(Bus bus) {
		this.bus = bus;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}
	
	

}
