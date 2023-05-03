package com.freebible.app.controllers;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.freebible.app.models.EngBookModel;
import com.freebible.app.models.EngChapterModel;
import com.freebible.app.models.EngOnlyBookModel;
import com.freebible.app.models.VersionModel;
import com.freebible.app.services.VersionService;



@RestController
@RequestMapping("/v1/")
//@RequestMapping(value="/v1/biblies",params="codversion")



public class VersionController {
	
	@Autowired
	private VersionService versionService;
	
    @GetMapping("bibles")
	public ArrayList<VersionModel> getVersion(){
		return this.versionService.getVersion();
    }
    
    //get version ENG
    @GetMapping(path = "bibles/{codversion}")
    public ArrayList getBiblebyVersion (@PathVariable("codversion")  Long codversion){
		if (codversion==0) {
			return this.versionService.getBibleEng();
    	}
		if (codversion==1) {
			return this.versionService.getBibleAsv();
		}
		return null;
		
	}

	@GetMapping(path = "bibles/{codversion}/{codbook}")
	public Optional<EngBookModel> getBibleBook( @PathVariable("codversion")  Long codversion, @PathVariable("codbook")  Long codbook){
		if(codversion==0) {
		return this.versionService.getBibleEngbyBook(codbook);
		}
		return null;
	}
	
	@GetMapping(path = "bibles/{codversion}/{codbook}/{codchapter}")
	public List<EngChapterModel> getBibleChapter( @PathVariable("codversion")  Long codversion, @PathVariable("codbook")  Long codbook, @PathVariable("codchapter")  Long codchapter){
		if(codversion==0) {
		return this.versionService.getBibleEngbyBookandChapter(codbook,codchapter);
		}
		return null;
	}
	
	@GetMapping(path = "bibles/{codversion}/{codbook}/{codchapter}/{codverse}")
	public List<EngChapterModel> getBibleChapter( @PathVariable("codversion")  Long codversion, @PathVariable("codbook")  Long codbook, @PathVariable("codchapter")  Long codchapter,@PathVariable("codverse")  Long codverse){
		if(codversion==0) {
		return this.versionService.getBiblebyBookChapterAndVerse(codbook,codchapter,codverse);
		}
		return null;
	}

	/*
	 * @GetMapping(path = "bibles/ENG/{codchapter}/{codverse}") public Optional<>
	 */
    

	

}

