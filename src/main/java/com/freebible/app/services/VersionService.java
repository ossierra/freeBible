package com.freebible.app.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freebible.app.models.AsvOnlyBookModel;
import com.freebible.app.models.EngBookModel;
import com.freebible.app.models.EngChapterModel;
import com.freebible.app.models.EngOnlyBookModel;
import com.freebible.app.models.VersionModel;
import com.freebible.app.repositories.IBookEngRepository;
import com.freebible.app.repositories.IChapterEngRepository;
import com.freebible.app.repositories.IOnlyBookAsvRepository;
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
    IOnlyBookAsvRepository onlybookAsvRepository;
     @Autowired
    IChapterEngRepository chapterEngRepository;
     



     
		public ArrayList<VersionModel> getVersion(){
			 return (ArrayList<VersionModel>) versionRepository.findAll();
			 
		 }
	 	public ArrayList<EngOnlyBookModel> getBibleEng(){
	 		return (ArrayList<EngOnlyBookModel>) onlybookEngRepository.findAll();
	 	 }
	 	public ArrayList<AsvOnlyBookModel> getBibleAsv(){
	 		return (ArrayList<AsvOnlyBookModel>) onlybookAsvRepository.findAll();
	 	 }
	 	
	 	public Optional<EngBookModel> getBibleEngbyBook(Long id){
	 		return  bookEngRepository.findById(id);
	 	 }
	 	



}
