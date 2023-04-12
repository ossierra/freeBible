package com.freebible.app.controllers;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.freebible.app.models.VersionModel;
import com.freebible.app.services.VersionService;

@RestController
@RequestMapping("/version")
public class VersionController {
	@Autowired
	private VersionService versionService;
	@GetMapping
	public ArrayList<VersionModel> getVersion(){
		return this.versionService.getVersion();
	}

}
