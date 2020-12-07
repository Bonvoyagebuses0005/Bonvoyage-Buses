package com.bonvoyage.models;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger payment_id;
	private Date payment_date;
	private String payment_mode;
	
	@OneToOne
	private Users user;
	
	@OneToOne
	private Ticket ticket;
	
	public Payment() {
		
	}

	public Payment(Date payment_date, String payment_mode, Users user, Ticket ticket) {
		super();
		this.payment_date = payment_date;
		this.payment_mode = payment_mode;
		this.user = user;
		this.ticket = ticket;
	}

	public BigInteger getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(BigInteger payment_id) {
		this.payment_id = payment_id;
	}

	public Date getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}

	public String getPayment_mode() {
		return payment_mode;
	}

	public void setPayment_mode(String payment_mode) {
		this.payment_mode = payment_mode;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", payment_date=" + payment_date + ", payment_mode=" + payment_mode
				+ ", user=" + user + ", ticket=" + ticket + "]";
	}
	
	

}
