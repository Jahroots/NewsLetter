package com.newsletter.model;

// Generated 29 sept. 2011 22:28:32 by Hibernate Tools 3.4.0.CR1

/**
 * IpValides generated by hbm2java
 */
public class IpValides implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String ip;
	private String login;

	public IpValides() {
	}

	public IpValides(String ip, String login) {
		this.ip = ip;
		this.login = login;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

}
