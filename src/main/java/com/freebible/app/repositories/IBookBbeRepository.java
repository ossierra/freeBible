package com.freebible.app.repositories;




import org.springframework.data.jpa.repository.JpaRepository;


import com.freebible.app.models.BbeBookModel;



public interface IBookBbeRepository extends JpaRepository<BbeBookModel, Long> {


}
