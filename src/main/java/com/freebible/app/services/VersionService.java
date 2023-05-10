package com.freebible.app.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.freebible.app.models.AsvBookModel;
import com.freebible.app.models.VersionModel;
import com.freebible.app.repositories.IBookAsvRepository;
import com.freebible.app.repositories.IBookBbeRepository;
import com.freebible.app.repositories.IBookDbyRepository;
import com.freebible.app.repositories.IBookEngRepository;
import com.freebible.app.repositories.IChapterAsvRepository;
import com.freebible.app.repositories.IChapterBbeRepository;
import com.freebible.app.repositories.IChapterDbyRepository;
import com.freebible.app.repositories.IChapterEngRepository;
import com.freebible.app.repositories.IVersionRepository;


@Service
public class VersionService {
     @Autowired
	IVersionRepository versionRepository;
     @Autowired
    IBookEngRepository bookEngRepository;
     @Autowired
    IChapterEngRepository chapterEngRepository;
     
     @Autowired
    IBookAsvRepository bookAsvRepository;
      @Autowired
    IChapterAsvRepository chapterAsvRepository;
      
      @Autowired
    IBookBbeRepository bookBbeRepository;
        @Autowired
    IChapterBbeRepository chapterBbeRepository;

    @Autowired
    IBookDbyRepository bookDbyRepository;
        @Autowired
    IChapterDbyRepository chapterDbyRepository;
        
        //NotContent
    	public ResponseEntity<List> NoTContent(){
	 		return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
	 	 }

       //Get all version
		public ArrayList<VersionModel> getVersion(){
			 return (ArrayList<VersionModel>) versionRepository.findAll();		 
		 }

		/*ENG*/
		//get ENG version
	 	public ResponseEntity<List> getBibleEng(){
	 		return ResponseEntity.status(HttpStatus.OK).body(bookEngRepository.findAll());
	 	 }
	 	//Get Eng by Book and chapter
	 	public ResponseEntity getBibleEngbyBook(Long codbook){
	 		
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterEngRepository.findByBook(codbook));
	 		
	 	 }
	 	//Get Eng by Book and chapter
	 	public ResponseEntity<List> getBibleEngbyBookandChapter(Long codbook,Long codchapter){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterEngRepository.findByBookChapter(codbook,codchapter));
	 		
	 	 }
	 	public ResponseEntity<List> getBibleEngbyBookChapterAndVerse(Long codbook,Long codchapter, Long codverse){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterEngRepository.findByBookChapterVerse(codbook,codchapter,codverse));
	 	}
	 	
	 	/*ASV*/
		//get Asv version
	 	public ResponseEntity<List> getBibleAsv(){
	 		//return (ArrayList) bookAsvRepository.findAll();
	 		return ResponseEntity.status(HttpStatus.OK).body(bookAsvRepository.findAll());
	 	 }
	 
	 	//Get Asv by Book and chapter
	 	public ResponseEntity getBibleAsvbyBook(Long codbook){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterAsvRepository.findByBook(codbook));
	 		
	 	 }
	 	//Get Asv by Book and chapter
	 	public ResponseEntity<List>  getBibleAsvbyBookandChapter(Long codbook,Long codchapter){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterAsvRepository.findByBookChapter(codbook,codchapter));
	 		
	 	 }
	 	//Get Asv 
	 	public ResponseEntity<List> getBibleAsvbyBookChapterAndVerse(Long codbook,Long codchapter, Long codverse){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterAsvRepository.findByBookChapterVerse(codbook,codchapter,codverse));
	 	}
	 	
	 	/*BBE*/
		//get Asv version
	 	public ResponseEntity<List> getBibleBbe(){
	 		return ResponseEntity.status(HttpStatus.OK).body(bookBbeRepository.findAll());
	 	 }
	 	//Get Asv by Book and chapter
	 	public ResponseEntity<List> getBibleBbebyBook(Long codbook){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterBbeRepository.findByBook(codbook));
	 		
	 	 }
	 	//Get Asv by Book and chapter
	 	public ResponseEntity<List>  getBibleBbebyBookandChapter(Long codbook,Long codchapter){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterBbeRepository.findByBookChapter(codbook,codchapter));
	 		
	 	 }
	 	//Get Asv 
	 	public ResponseEntity<List> getBibleBbebyBookChapterAndVerse(Long codbook,Long codchapter, Long codverse){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterBbeRepository.findByBookChapterVerse(codbook,codchapter,codverse));
	 	}
	 	
	 	/*DBY*/
		//get Asv version
	 	public ResponseEntity<List> getBibleDby(){
	 		return ResponseEntity.status(HttpStatus.OK).body(bookDbyRepository.findAll());
	 	 }
	 	//Get Asv by Book and chapter
	 	public ResponseEntity <List> getBibleDbybyBook(Long codbook){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterDbyRepository.findByBook(codbook));
	 		
	 	 }
	 	//Get Asv by Book and chapter
	 	public ResponseEntity <List>  getBibleDbybyBookandChapter(Long codbook,Long codchapter){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterDbyRepository.findByBookChapter(codbook,codchapter));
	 		
	 	 }
	 	//Get Asv 
	 	public ResponseEntity <List> getBibleDbybyBookChapterAndVerse(Long codbook,Long codchapter, Long codverse){
	 		return ResponseEntity.status(HttpStatus.OK).body(chapterDbyRepository.findByBookChapterVerse(codbook,codchapter,codverse));
	 	}
	 	
		
	 	
	 	



}
