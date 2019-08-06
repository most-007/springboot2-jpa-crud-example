package net.guides.springboot2.springboot2jpacrudexample.model;

public class User {
	private String status;

	public User(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}