package com.newsletter.model;

// Generated 29 sept. 2011 22:28:32 by Hibernate Tools 3.4.0.CR1

/**
 * Hacker generated by hbm2java
 */
public class Hacker implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String email;
	private String pwd;
	private String ladate;

	public Hacker() {
	}

	public Hacker(String email, String pwd, String ladate) {
		this.email = email;
		this.pwd = pwd;
		this.ladate = ladate;
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

	public String getPwd() {
		return this.pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getLadate() {
		return this.ladate;
	}

	public void setLadate(String ladate) {
		this.ladate = ladate;
	}

}
