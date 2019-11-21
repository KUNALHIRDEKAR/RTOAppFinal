package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.VhclEntity;

public interface VhclRepository extends JpaRepository<VhclEntity,Integer> {
	
	@Query("from VhclEntity e where e.detail.ownerID=:id")
	VhclEntity findByownerId(Integer id);


	

}
