package com.freebible.app.controllers;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freebible.app.models.BookModel;
import com.freebible.app.models.VersionModel;
import com.freebible.app.services.BookService;
import com.freebible.app.services.VersionService;

@RestController
public class VersionController {
	@Autowired
	private VersionService versionService;
	@Autowired
	private BookService bookService;
	@GetMapping("/version")
	public ArrayList<VersionModel> getVersion(){
		return this.versionService.getVersion();
	}
	@GetMapping("/book")
	public ArrayList<BookModel> getBook(){
		return this.bookService.getBook();
	}

}

