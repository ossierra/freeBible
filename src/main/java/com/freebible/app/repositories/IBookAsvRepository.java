package com.freebible.app.repositories;




import org.springframework.data.jpa.repository.JpaRepository;

import com.freebible.app.models.AsvBookModel;



public interface IBookAsvRepository extends JpaRepository<AsvBookModel, Long> {


}
