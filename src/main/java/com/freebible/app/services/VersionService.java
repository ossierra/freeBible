package com.freebible.app.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.freebible.app.models.VersionModel;
import com.freebible.app.repositories.IVersionRepository;

@Service
public class VersionService {
     @Autowired
	IVersionRepository versionRepository;
     
     public ArrayList<VersionModel> getVersion(){
    	 return (ArrayList<VersionModel>) versionRepository.findAll();
    	 
    	 
     }

}
