package com.freebible.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.freebible.app.models.EngBookModel;

public interface IBookEngRepository extends JpaRepository<EngBookModel, Long> {



}
