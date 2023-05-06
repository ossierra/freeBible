package com.freebible.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.freebible.app.models.EngBookModel;
import com.freebible.app.models.EngChapterModel;
import com.freebible.app.models.EngOnlyBookModel;
import com.freebible.app.models.VersionModel;
import com.freebible.app.repositories.IBookEngRepository;
import com.freebible.app.repositories.IChapterEngRepository;
import com.freebible.app.repositories.IOnlyBookEngRepository;
import com.freebible.app.repositories.IVersionRepository;


@Service
public class VersionService {
     @Autowired
	IVersionRepository versionRepository;
     @Autowired
    IBookEngRepository bookEngRepository;
     @Autowired
    IOnlyBookEngRepository onlybookEngRepository;

     @Autowired
    IChapterEngRepository chapterEngRepository;

    

       //Get all version
		public ArrayList<VersionModel> getVersion(){
			 return (ArrayList<VersionModel>) versionRepository.findAll();
			 
		 }
		/*ENG*/
		//get ENG version
	 	public ArrayList<EngOnlyBookModel> getBibleEng(){
	 		return (ArrayList<EngOnlyBookModel>) onlybookEngRepository.findAll();
	 	 }
	 	//Get Eng by Book and chapter
	 	public ArrayList<?> getBibleEngbyBook(Long codbook){
	 		return  (ArrayList<?>) chapterEngRepository.findByBook(codbook);
	 		
	 	 }
	 	//Get Eng by Book and chapter
	 	public List<EngChapterModel> getBibleEngbyBookandChapter(Long codbook,Long codchapter){
	 		return  chapterEngRepository.findByBookChapter(codbook,codchapter);
	 		
	 	 }
	 	public List<EngChapterModel> getBiblebyBookChapterAndVerse(Long codbook,Long codchapter, Long codverse){
	 		return  chapterEngRepository.findByBookChapterVerse(codbook,codchapter,codverse);
	 	}
	 	
		
	 	
	 	



}
