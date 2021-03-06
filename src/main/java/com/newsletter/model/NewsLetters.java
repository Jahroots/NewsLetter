package com.newsletter.model;

// Generated 29 sept. 2011 22:28:32 by Hibernate Tools 3.4.0.CR1

/**
 * NewsLetters generated by hbm2java
 */
public class NewsLetters implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String dateNews;
	private String titre;
	private String laPage;
	private String titreR;
	private String laPageR;

	public NewsLetters() {
	}

	public NewsLetters(String dateNews, String titre, String laPage,
                       String titreR, String laPageR) {
		this.dateNews = dateNews;
		this.titre = titre;
		this.laPage = laPage;
		this.titreR = titreR;
		this.laPageR = laPageR;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDateNews() {
		return this.dateNews;
	}

	public void setDateNews(String dateNews) {
		this.dateNews = dateNews;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getLaPage() {
		return this.laPage;
	}

	public void setLaPage(String laPage) {
		this.laPage = laPage;
	}

	public String getTitreR() {
		return this.titreR;
	}

	public void setTitreR(String titreR) {
		this.titreR = titreR;
	}

	public String getLaPageR() {
		return this.laPageR;
	}

	public void setLaPageR(String laPageR) {
		this.laPageR = laPageR;
	}

}
