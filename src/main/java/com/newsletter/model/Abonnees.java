package com.newsletter.model;

// Generated 29 sept. 2011 22:28:32 by Hibernate Tools 3.4.0.CR1

/**
 * Abonnees generated by hbm2java
 */
public class Abonnees implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String email;
	private boolean active;

	public Abonnees() {
	}

	public Abonnees(boolean active) {
		this.active = active;
	}

	public Abonnees(String email, boolean active) {
		this.email = email;
		this.active = active;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

}
