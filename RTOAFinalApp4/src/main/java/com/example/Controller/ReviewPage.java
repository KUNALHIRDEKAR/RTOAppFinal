package com.example.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.VhclRegistration;
import com.example.entity.AddressEntity;
import com.example.entity.OwnerEntity;
import com.example.entity.VhclEntity;
import com.example.entity.VhclRegEntity;
import com.example.repository.AddrsRepository;
import com.example.repository.OwnerRepository;
import com.example.repository.VhclRegRepository;
import com.example.repository.VhclRepository;

@Controller
public class ReviewPage {

	
	@RequestMapping("/reviewPage")
	public String reviewPage(Model model, HttpSession ses) 
	{
		OwnerEntity ownerEntity=(OwnerEntity) ses.getAttribute("ownerEntity");
		AddressEntity addressEntity=(AddressEntity) ses.getAttribute("addressEntity");
		VhclEntity vhclEntity=(VhclEntity) ses.getAttribute("vhclEntity");
		
		 
		 model.addAttribute("OwnerDetail",ownerEntity);
		 model.addAttribute("addressDomain",addressEntity);
		 model.addAttribute("vhclDomain",vhclEntity);
		 
		 return "reviewAndRegister";
	}
	@RequestMapping(value = "/finalPage",method = RequestMethod.POST)
	public String finalPage(@ModelAttribute("vhclRegistration") VhclRegistration vhclRegistration,
			HttpSession ses,Model model)	{

		 VhclRegEntity vhclRegEntity=(VhclRegEntity) ses.getAttribute("vhclRegEntity");
		model.addAttribute("vhclRegistration", vhclRegEntity);
		
		return "registerNumber";
}
}
