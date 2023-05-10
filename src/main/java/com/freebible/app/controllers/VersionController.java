package com.freebible.app.controllers;


import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.freebible.app.models.VersionModel;
import com.freebible.app.services.VersionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/v1/")
@Api(tags = "Controller Free Bible", description = "Controller for API Free Bible, all method used. ")
@ApiResponses(value = {@ApiResponse(code = 200,response = VersionController.class, message = "OK"),
		@ApiResponse(code = 204, message = "Not Content")})
public class VersionController {
	
	@Autowired
	private VersionService versionService;
	@ApiOperation(value = "This method is used to get all versions.")
    @GetMapping("bibles")
	/*For all version*/
	public ArrayList<VersionModel> getAllVersions(){
		return this.versionService.getVersion();
    }
    

	@ApiOperation(value = "This method is used to get a Bible version")
	
    @GetMapping(path = "bibles/{idversion}")
    public ResponseEntity<List> getBiblebyVersion (@PathVariable("idversion")  Long codversion){
		/*For ENG versión*/
		if (codversion==0) {
			return this.versionService.getBibleEng();
    	}
		if (codversion==1) {
			return this.versionService.getBibleAsv();
    	}
		if (codversion==2) {
			return this.versionService.getBibleBbe();
    	}
		if (codversion==3) {
			return this.versionService.getBibleDby();
    	}
		return this.versionService.NoTContent();
		
	}
    @ApiOperation(value = "This method is used to get a book")
	@GetMapping(path = "bibles/{idversion}/{codbook}")
	public ResponseEntity getBibleVersionBook( @PathVariable("idversion")  Long codversion, @PathVariable("codbook")  Long codbook){
    	/*For ENG versión*/
    	if(codversion==0) {
		       return this.versionService.getBibleEngbyBook(codbook);
		}
    	if(codversion==1) {
		       return this.versionService.getBibleAsvbyBook(codbook);
		}
    	if(codversion==2) {
		       return this.versionService.getBibleBbebyBook(codbook);
		}
    	if(codversion==3) {
		       return this.versionService.getBibleDbybyBook(codbook);
		       
		}
    	return this.versionService.NoTContent();
	}
    @ApiOperation(value = "This method is used to get a chapter")
	@GetMapping(path = "bibles/{idversion}/{codbook}/{codchapter}")
	public ResponseEntity getBibleVersionBookChapter( @PathVariable("idversion")  Long codversion, @PathVariable("codbook")  Long codbook, @PathVariable("codchapter")  Long codchapter){
    	/*For ENG versión*/
    	if(codversion==0) {
		return this.versionService.getBibleEngbyBookandChapter(codbook,codchapter);
		}
    	if(codversion==1) {
    		return this.versionService.getBibleAsvbyBookandChapter(codbook,codchapter);
    		}
    	if(codversion==2) {
    		return this.versionService.getBibleBbebyBookandChapter(codbook,codchapter);
    		}
    	if(codversion==3) {
    		return this.versionService.getBibleDbybyBookandChapter(codbook,codchapter);
    		}
    	return this.versionService.NoTContent();
	}
    @ApiOperation(value = "This method is used to get a verse")
	@GetMapping(path = "bibles/{idversion}/{codbook}/{codchapter}/{codverse}")
	public ResponseEntity<List> getBibleVersionBookChapterVerse( @PathVariable("idversion")  Long codversion, @PathVariable("codbook")  Long codbook, @PathVariable("codchapter")  Long codchapter,@PathVariable("codverse")  Long codverse){
    	/*For ENG versión*/
    	if(codversion==0) {
		return this.versionService.getBibleEngbyBookChapterAndVerse(codbook,codchapter,codverse);
		}
    	
    	if(codversion==1) {
    		return this.versionService.getBibleAsvbyBookChapterAndVerse(codbook,codchapter,codverse);
    		}
    	if(codversion==2) {
    		return this.versionService.getBibleBbebyBookChapterAndVerse(codbook,codchapter,codverse);
    		}
    	if(codversion==3) {
    		return this.versionService.getBibleDbybyBookChapterAndVerse(codbook,codchapter,codverse);
    		}
    	return this.versionService.NoTContent();
	}
    

	

}

