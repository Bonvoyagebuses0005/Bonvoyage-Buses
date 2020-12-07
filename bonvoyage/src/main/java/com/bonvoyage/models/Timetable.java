package com.bonvoyage.models;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Timetable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger timetable_id;
	private Date departure_date_time;
	private Date arrival_date_time;
	
	@OneToMany
	private List<Bus> bus;
	
	@OneToMany
	private List<Route> route;
	
	@OneToMany
	private List<Driver> driver;
	
	public Timetable() {
		
	}

	public Timetable(Date departure_date_time, Date arrival_date_time, List<Bus> bus, List<Route> route,
			List<Driver> driver) {
		super();
		this.departure_date_time = departure_date_time;
		this.arrival_date_time = arrival_date_time;
		this.bus = bus;
		this.route = route;
		this.driver = driver;
	}

	public BigInteger getTimetable_id() {
		return timetable_id;
	}

	public void setTimetable_id(BigInteger timetable_id) {
		this.timetable_id = timetable_id;
	}

	public Date getDeparture_date_time() {
		return departure_date_time;
	}

	public void setDeparture_date_time(Date departure_date_time) {
		this.departure_date_time = departure_date_time;
	}

	public Date getArrival_date_time() {
		return arrival_date_time;
	}

	public void setArrival_date_time(Date arrival_date_time) {
		this.arrival_date_time = arrival_date_time;
	}

	public List<Bus> getBus() {
		return bus;
	}

	public void setBus(List<Bus> bus) {
		this.bus = bus;
	}

	public List<Route> getRoute() {
		return route;
	}

	public void setRoute(List<Route> route) {
		this.route = route;
	}

	public List<Driver> getDriver() {
		return driver;
	}

	public void setDriver(List<Driver> driver) {
		this.driver = driver;
	}

	@Override
	public String toString() {
		return "Timetable [timetable_id=" + timetable_id + ", departure_date_time=" + departure_date_time
				+ ", arrival_date_time=" + arrival_date_time + ", bus=" + bus + ", route=" + route + ", driver="
				+ driver + "]";
	}

	

}
