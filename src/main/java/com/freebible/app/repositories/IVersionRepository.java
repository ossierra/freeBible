package com.freebible.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.freebible.app.models.VersionModel;

@Repository
public interface IVersionRepository extends JpaRepository<VersionModel, Long>{

}
