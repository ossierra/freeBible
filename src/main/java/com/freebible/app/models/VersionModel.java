package com.freebible.app.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="bible_version")
public class VersionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String abbreviation;
	@Column 
	private String language;
	@Column 
	private String version;
	@Column
	private String info_url;
	@Column
	private Long published;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getInfo_url() {
		return info_url;
	}
	public void setInfo_url(String info_url) {
		this.info_url = info_url;
	}
	public Long getPublished() {
		return published;
	}
	public void setPublished(Long published) {
		this.published = published;
	}
	

}
