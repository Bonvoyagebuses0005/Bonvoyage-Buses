package com.bonvoyage.models;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger driver_id;
	private String driver_name;
	private String driver_available;

	public Driver() {
		
	}

	public Driver(String driver_name, String driver_available) {
		super();
		this.driver_name = driver_name;
		this.driver_available = driver_available;
	}

	public BigInteger getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(BigInteger driver_id) {
		this.driver_id = driver_id;
	}

	public String getDriver_name() {
		return driver_name;
	}

	public void setDriver_name(String driver_name) {
		this.driver_name = driver_name;
	}

	public String getDriver_available() {
		return driver_available;
	}

	public void setDriver_available(String driver_available) {
		this.driver_available = driver_available;
	}

	@Override
	public String toString() {
		return "Driver [driver_id=" + driver_id + ", driver_name=" + driver_name + ", driver_available="
				+ driver_available + "]";
	}

	
	
	
	
}
