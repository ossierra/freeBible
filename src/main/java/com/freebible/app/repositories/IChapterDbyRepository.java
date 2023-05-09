package com.freebible.app.repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.freebible.app.models.BbeChapterModel;
import com.freebible.app.models.DbyChapterModel;


public interface IChapterDbyRepository extends JpaRepository<DbyChapterModel, Long> {

	 @Query(value = "select * from bible_asv c where c.book = :codbook", nativeQuery=true)
	 List<DbyChapterModel> findByBook(Long codbook);
	 @Query(value = "select * from bible_asv c where c.book = :codbook and c.chapter=:codchapter", nativeQuery=true)
     List<DbyChapterModel> findByBookChapter(Long codbook, Long codchapter);
	 @Query(value = "select * from bible_asv c where c.book = :codbook and c.chapter=:codchapter and c.verse=:codverse", nativeQuery=true)
     List<DbyChapterModel> findByBookChapterVerse(Long codbook, Long codchapter, Long codverse);
	 
	 

}
