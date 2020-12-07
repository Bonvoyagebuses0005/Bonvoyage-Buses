package com.bonvoyage.models;

import java.math.BigInteger;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private BigInteger feedback_id;
	private String feedback_message;
	
	@OneToMany
	private List<Users> users;
	
	public Feedback() {
		
	}

	

	public Feedback(String feedback_message, List<Users> users) {
		super();
		this.feedback_message = feedback_message;
		this.users = users;
	}



	public BigInteger getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(BigInteger feedback_id) {
		this.feedback_id = feedback_id;
	}

	public String getFeedback_message() {
		return feedback_message;
	}

	public void setFeedback_message(String feedback_message) {
		this.feedback_message = feedback_message;
	}

	public List<Users> getUsers() {
		return users;
	}

	public void setUsers(List<Users> users) {
		this.users = users;
	}



	@Override
	public String toString() {
		return "Feedback [feedback_id=" + feedback_id + ", feedback_message=" + feedback_message + ", users=" + users
				+ "]";
	}

	
	
	
	

}
