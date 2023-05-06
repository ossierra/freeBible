package com.freebible.app.repositories;


import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.freebible.app.models.EngChapterModel;

public interface IChapterEngRepository extends JpaRepository<EngChapterModel, Long> {

	 @Query(value = "select * from bible_eng c where c.book = :codbook", nativeQuery=true)
	 List<EngChapterModel> findByBook(Long codbook);
	 @Query(value = "select * from bible_eng c where c.book = :codbook and c.chapter=:codchapter", nativeQuery=true)
     List<EngChapterModel> findByBookChapter(Long codbook, Long codchapter);
	 @Query(value = "select * from bible_eng c where c.book = :codbook and c.chapter=:codchapter and c.verse=:codverse", nativeQuery=true)
     List<EngChapterModel> findByBookChapterVerse(Long codbook, Long codchapter, Long codverse);
	 
	 

}
