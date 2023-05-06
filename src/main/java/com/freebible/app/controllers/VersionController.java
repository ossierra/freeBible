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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;



@RestController
@RequestMapping("/v1/")
@Api(tags = "Controller Free Bible", description = "Controller for API Free Bible, all method used. ")
public class VersionController {
	
	@Autowired
	private VersionService versionService;
	@ApiOperation(value = "This method is used to get all versions.")
    @GetMapping("bibles")
	public ArrayList<VersionModel> getAllVersions(){
		return this.versionService.getVersion();
    }
    

	@ApiOperation(value = "This method is used to get a Bible version")
    @GetMapping(path = "bibles/{idversion}")
    public ArrayList getBiblebyVersion (@PathVariable("idversion")  Long codversion){
		/*For ENG versión*/
		if (codversion==0) {
			return this.versionService.getBibleEng();
    	}
		if (codversion==1) {
			return this.versionService.getBibleAsv();
		}
		return null;
		
	}
    @ApiOperation(value = "This method is used to get a book")
	@GetMapping(path = "bibles/{idversion}/{codbook}")
	public Optional<EngBookModel> getBibleVersionBook( @PathVariable("idversion")  Long codversion, @PathVariable("codbook")  Long codbook){
    	/*For ENG versión*/
    	if(codversion==0) {
		return this.versionService.getBibleEngbyBook(codbook);
		}
		return null;
	}
    @ApiOperation(value = "This method is used to get a chapter")
	@GetMapping(path = "bibles/{idversion}/{codbook}/{codchapter}")
	public List<EngChapterModel> getBibleVersionBookChapter( @PathVariable("idversion")  Long codversion, @PathVariable("codbook")  Long codbook, @PathVariable("codchapter")  Long codchapter){
    	/*For ENG versión*/
    	if(codversion==0) {
		return this.versionService.getBibleEngbyBookandChapter(codbook,codchapter);
		}
		return null;
	}
    @ApiOperation(value = "This method is used to get a verse")
	@GetMapping(path = "bibles/{idversion}/{codbook}/{codchapter}/{codverse}")
	public List<EngChapterModel> getBibleVersionBookChapterVerse( @PathVariable("idversion")  Long codversion, @PathVariable("codbook")  Long codbook, @PathVariable("codchapter")  Long codchapter,@PathVariable("codverse")  Long codverse){
    	/*For ENG versión*/
    	if(codversion==0) {
		return this.versionService.getBiblebyBookChapterAndVerse(codbook,codchapter,codverse);
		}
		return null;
	}
    

	

}

