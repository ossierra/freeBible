package com.freebible.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freebible.app.models.BookModel;

@Repository
public interface IBookRepository extends JpaRepository<BookModel, Long>{

}
