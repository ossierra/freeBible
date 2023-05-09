package com.freebible.app.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.freebible.app.models.BbeChapterModel;


public interface IChapterBbeRepository extends JpaRepository<BbeChapterModel, Long> {

	 @Query(value = "select * from bible_asv c where c.book = :codbook", nativeQuery=true)
	 List<BbeChapterModel> findByBook(Long codbook);
	 @Query(value = "select * from bible_asv c where c.book = :codbook and c.chapter=:codchapter", nativeQuery=true)
     List<BbeChapterModel> findByBookChapter(Long codbook, Long codchapter);
	 @Query(value = "select * from bible_asv c where c.book = :codbook and c.chapter=:codchapter and c.verse=:codverse", nativeQuery=true)
     List<BbeChapterModel> findByBookChapterVerse(Long codbook, Long codchapter, Long codverse);
	 
	 

}
