package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.OwnerEntity;
@Repository
public interface OwnerRepository extends JpaRepository<OwnerEntity,Integer>{

	OwnerEntity findByEmail(String email);

	
}
