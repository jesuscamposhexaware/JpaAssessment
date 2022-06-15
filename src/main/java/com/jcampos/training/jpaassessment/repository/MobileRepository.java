package com.jcampos.training.jpaassessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcampos.training.jpaassessment.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	
	public List<Mobile> findAllByMobileName(String mobileName);

}
