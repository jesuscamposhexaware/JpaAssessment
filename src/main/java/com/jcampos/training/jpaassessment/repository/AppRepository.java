package com.jcampos.training.jpaassessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jcampos.training.jpaassessment.entity.App;

@Repository
public interface AppRepository extends JpaRepository<App, Integer>{

}
