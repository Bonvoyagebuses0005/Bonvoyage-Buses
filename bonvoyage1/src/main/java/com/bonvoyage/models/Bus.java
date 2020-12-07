package com.bonvoyage.models;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger bus_id;
	private String bus_name;
	private int total_seats;
	private String bus_type;
	
	public Bus() {
		
	}

	public Bus(String bus_name, int total_seats, String bus_type) {
		super();
		this.bus_name = bus_name;
		this.total_seats = total_seats;
		this.bus_type = bus_type;
	}

	public BigInteger getBus_id() {
		return bus_id;
	}

	public void setBus_id(BigInteger bus_id) {
		this.bus_id = bus_id;
	}

	public String getBus_name() {
		return bus_name;
	}

	public void setBus_name(String bus_name) {
		this.bus_name = bus_name;
	}

	public int getTotal_seats() {
		return total_seats;
	}

	public void setTotal_seats(int total_seats) {
		this.total_seats = total_seats;
	}

	public String getBus_type() {
		return bus_type;
	}

	public void setBus_type(String bus_type) {
		this.bus_type = bus_type;
	}

	@Override
	public String toString() {
		return "Bus [bus_id=" + bus_id + ", bus_name=" + bus_name + ", total_seats=" + total_seats + ", bus_type="
				+ bus_type + "]";
	}
	
	

}
