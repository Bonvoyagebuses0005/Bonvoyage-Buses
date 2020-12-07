package com.bonvoyage.models;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger admin_id;
	private String admin_email;
	private String admin_password;
	
	public Admin() {
		
	}

	public Admin(String admin_email, String admin_password) {
		super();
		this.admin_email = admin_email;
		this.admin_password = admin_password;
	}

	public BigInteger getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(BigInteger admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_email() {
		return admin_email;
	}

	public void setAdmin_email(String admin_email) {
		this.admin_email = admin_email;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	@Override
	public String toString() {
		return "Admin [admin_id=" + admin_id + ", admin_email=" + admin_email + ", admin_password=" + admin_password
				+ "]";
	}
	
	

}
