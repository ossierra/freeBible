package com.freebible.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.freebible.app.models.EngOnlyBookModel;

public interface IOnlyBookEngRepository extends JpaRepository<EngOnlyBookModel, Long> {

}
