package com.bonvoyage.models;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Route {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger route_id;
	private String source;
	private String destination;
	private int route_fare;
	
	public Route() {
		
	}

	public Route(String source, String destination, int route_fare) {
		super();
		this.source = source;
		this.destination = destination;
		this.route_fare = route_fare;
	}

	public BigInteger getRoute_id() {
		return route_id;
	}

	public void setRoute_id(BigInteger route_id) {
		this.route_id = route_id;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getRoute_fare() {
		return route_fare;
	}

	public void setRoute_fare(int route_fare) {
		this.route_fare = route_fare;
	}

	@Override
	public String toString() {
		return "Route [route_id=" + route_id + ", source=" + source + ", destination=" + destination + ", route_fare="
				+ route_fare + "]";
	}
	
	

}
