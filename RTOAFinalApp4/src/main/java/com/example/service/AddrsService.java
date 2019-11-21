package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.AddressEntity;
import com.example.repository.AddrsRepository;

@Service
public class AddrsService {

	@Autowired
	AddrsRepository addrsRepository;
	public AddressEntity findByOwnerId(Integer id) {
		
		AddressEntity addressEntity=addrsRepository.findByownerId(id);
		return addressEntity;
	}

}
