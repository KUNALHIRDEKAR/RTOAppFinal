package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entity.AddressEntity;
import com.example.entity.VhclRegEntity;

public interface VhclRegRepository extends JpaRepository<VhclRegEntity,Integer>  {

	@Query("SELECT u FROM VhclRegEntity u WHERE u.regNumber =regNumber")
	public VhclRegEntity getVhclRegByRegNum(String regNumber);

	@Query("select e.detail.ownerID from VhclRegEntity e where e.regNumber=:regNumber")
	public Integer findByRegistrationNumber(String regNumber);
	
	@Query("from VhclRegEntity e where e.detail.ownerID=:id")
	public VhclRegEntity findByownerId(Integer id);
	

	
	}
