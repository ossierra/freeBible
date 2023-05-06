package com.freebible.app.models;








import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="bible_version")
public class VersionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("idversion")
	private Long id;
	private String abbreviation;
	private String language;
	private String version;
	@JsonProperty("info")
	private String info_url;

	
	
	@OneToMany(mappedBy = "versionModel")
    private Set<EngBookModel> EngBooks; 


	/*
	public EngBookModel getEngBookModel() {
		return engBookModel;
	}
	public void setEngBookModel(EngBookModel engBookModel) {
		this.engBookModel = engBookModel;
	}*/
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAbbreviation() {
		return abbreviation;
	}
	public String abbreviation() {
		return  abbreviation;
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
	
	

}
