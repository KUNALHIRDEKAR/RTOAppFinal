package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entity.AddressEntity;
@Repository
public interface AddrsRepository extends JpaRepository<AddressEntity, Integer>{

	
	@Query("from AddressEntity e where e.detail.ownerID=:id")
	AddressEntity findByownerId(Integer id);

}
