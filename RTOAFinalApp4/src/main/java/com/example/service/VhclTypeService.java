package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.VhclEntity;
import com.example.repository.VhclRepository;

@Service
public class VhclTypeService {
	@Autowired
	private VhclRepository vhclRepository;
	
	public VhclEntity findByOwnerId(Integer id) {
		// TODO Auto-generated method stub
		VhclEntity vhclEntity=vhclRepository.findByownerId(id);
		return vhclEntity;
	}

}
