package com.freebible.app.repositories;




import org.springframework.data.jpa.repository.JpaRepository;


import com.freebible.app.models.DbyBookModel;



public interface IBookDbyRepository extends JpaRepository<DbyBookModel, Long> {


}
