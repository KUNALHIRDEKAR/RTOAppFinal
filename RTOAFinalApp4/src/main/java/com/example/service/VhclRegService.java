package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.VhclRegEntity;
import com.example.repository.VhclRegRepository;

@Service
public class VhclRegService {

	@Autowired
	private VhclRegRepository vhclRegRepository;

	public Integer getVhclRegByRegNum(String regNumber) {
		// TODO Auto-generated method stub
		Integer ownerId = vhclRegRepository.findByRegistrationNumber(regNumber);
		return ownerId;
	}

	public VhclRegEntity findByOwnerId(Integer id) {
		// TODO Auto-generated method stub
		VhclRegEntity vhclRegEntity=vhclRegRepository.findByownerId(id);
		return vhclRegEntity;
	}
}
