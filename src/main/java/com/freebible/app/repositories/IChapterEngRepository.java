package com.freebible.app.repositories;

import java.awt.print.Pageable;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import com.freebible.app.models.EngChapterModel;

public interface IChapterEngRepository extends JpaRepository<EngChapterModel, Long> {




}
