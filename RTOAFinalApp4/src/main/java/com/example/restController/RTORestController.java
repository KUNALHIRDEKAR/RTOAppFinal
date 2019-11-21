package com.example.restController;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.AddressEntity;
import com.example.entity.OwnerEntity;
import com.example.entity.VhclEntity;
import com.example.entity.VhclRegEntity;
import com.example.repository.AddrsRepository;
import com.example.repository.OwnerRepository;
import com.example.repository.VhclRegRepository;
import com.example.repository.VhclRepository;
import com.example.service.AddrsService;
import com.example.service.OwnerService;
import com.example.service.VhclRegService;
import com.example.service.VhclTypeService;
import com.example.summary.Summary;

@RestController
@RequestMapping("users")
public class RTORestController {
	@Autowired
	OwnerRepository ownerRepository;
	@Autowired
	AddrsRepository addrsRepository;

	@Autowired
	VhclRepository vhclRepository;

	@Autowired
	VhclRegService vhclRegService;

	@Autowired
	OwnerService ownerService;
	@Autowired
	AddrsService addrsService;
	@Autowired
	VhclTypeService vhclTypeService;
	
	
	@GetMapping(name = "/", produces = { "application/json", "application/xml" })
	public @ResponseBody Summary getDetails(@RequestParam("regNum") String regNumber) {
		Summary summary = new Summary();

		Integer id = vhclRegService.getVhclRegByRegNum(regNumber);
		//summary.setVhclRegEntity(vhclRegEntity);
		OwnerEntity ownerEntity = ownerService.getById(id);
		
		AddressEntity addressEntity=addrsService.findByOwnerId(id);
		VhclRegEntity vhclRegEntity=vhclRegService.findByOwnerId(id);  
		VhclEntity vhclEntity =vhclTypeService.findByOwnerId(id);
		summary.setOwnerEntity(ownerEntity);
		summary.setAddressEntity(addressEntity);
		summary.setVhclRegEntity(vhclRegEntity);
		summary.setVhclEntity(vhclEntity);
		return summary;
	}

	/*
	 * @GetMapping(name = "/", produces = { "application/json", "application/xml" })
	 * public @ResponseBody OwnerEntity getDetails(@RequestParam("oid") String oid)
	 * { OwnerEntity ownerEntity = ownerService.getById(oid); return ownerEntity; }
	 */

}
