package com.freebible.app.repositories;




import org.springframework.data.jpa.repository.JpaRepository;

import com.freebible.app.models.EngBookModel;


public interface IBookEngRepository extends JpaRepository<EngBookModel, Long> {


}
