package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.OwnerEntity;
import com.example.repository.OwnerRepository;
@Service
public class OwnerService {
	@Autowired
	private OwnerRepository repo;
	
	public OwnerEntity getById(Integer id) {
		//Integer oid=Integer.parseInt(id);
		Optional<OwnerEntity> optional = repo.findById(id);
		OwnerEntity ownerEntity = optional.get();
		return ownerEntity;
	}

}
