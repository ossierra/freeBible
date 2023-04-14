package com.freebible.app.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.freebible.app.models.BookModel;
import com.freebible.app.repositories.IBookRepository;


@Service
public class BookService {
     @Autowired
	IBookRepository bookRepository;
     
     public ArrayList<BookModel> getBook(){
    	 return (ArrayList<BookModel>) bookRepository.findAll();
    	 
    	 
     }

}
