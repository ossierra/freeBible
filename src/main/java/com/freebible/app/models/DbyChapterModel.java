package com.freebible.app.models;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bible_dby")
public class DbyChapterModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	private Long id;
	@Column(insertable=false, updatable=false)
	private Long book;
	private Long chapter;
	private Long verse;
	private String text;



	public Long getBook() { 
		  return book; 
	} 
	public void setBook(Long book) {
	  this.book = book; 
	} 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getChapter() {
		return chapter;
	}
	public void setChapter(Long chapter) {
		this.chapter = chapter;
	}
	public Long getVerse() {
		return verse;
	}
	public void setVerse(Long verse) {
		this.verse = verse;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	

	
	

}
