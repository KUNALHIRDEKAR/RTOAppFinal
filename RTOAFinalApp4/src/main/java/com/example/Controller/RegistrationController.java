package com.example.Controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
import com.example.repository.VhclRegRepository;

@Controller
public class RegistrationController {
	@Autowired
	private VhclRegRepository vhclRegRepository;
	 
	
	@RequestMapping("/sumbitAndReviewPage1")
	public String  vhclRegistrationFormPage(Model model,HttpSession ses) 
	{	//this is newly added
		OwnerEntity ownerEntity =(OwnerEntity) ses.getAttribute("ownerEntity");
		int ownerID =ownerEntity.getOwnerID();
		//
		VhclRegistration vhclRegistration=new VhclRegistration();
	//this alsos
		vhclRegistration.setOwnerID(ownerID);
		//
		model.addAttribute("vhclRegistration",vhclRegistration);
		return "registration";
	}
	
	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String vhclRegistrationFormPageSave(@ModelAttribute("vhclRegistration") VhclRegistration vhclRegistration,HttpSession ses) 
	{
		
		VhclRegEntity vhclRegEntity =new VhclRegEntity(); 
		OwnerEntity ownerEntity=(OwnerEntity) ses.getAttribute("ownerEntity");
		AddressEntity addressEntity=(AddressEntity) ses.getAttribute("addressEntity");
		VhclEntity vhclEntity=(VhclEntity) ses.getAttribute("vhclEntity");
		vhclRegEntity.setDetail(ownerEntity);
		vhclRegistration.setRegNumber(getRegistrationNo(addressEntity.getState()));
		 BeanUtils.copyProperties(vhclRegistration, vhclRegEntity);
		 //vhclRegEntity.setDetail(ownerEntity);
		 vhclRegRepository.save(vhclRegEntity); 
		ses.setAttribute("vhclRegEntity",vhclRegEntity);
		return "redirect:/reviewPage";
		
	}
	
	
	public String getRegistrationNo(String state) 
	{
		Random rand=new Random();
		int rand_int2=rand.nextInt(99);
		String characters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String randomString="";
		int length=2;
		char[] text =new char[length];
		for (int i = 0; i < length; i++) {
			text[i]=characters.charAt(rand.nextInt(characters.length()));
		}
		for (int i = 0; i < text.length; i++) {
			randomString+=text[i];
		}
		int rand_int1=rand.nextInt(9999);
		
		
		String s=state;
		String center=s;
		if(s.equalsIgnoreCase("Maharastra"))
		{
			center="MH";
		}
		else if(s.equalsIgnoreCase("Andhra Pradesh"))
		{
			center="AP";
		}
		else if(s.equalsIgnoreCase("Arunachal Pradesh"))
		{
			center="AR";
		}
		else if(s.equalsIgnoreCase("Bihar"))
		{
			center="BR";
		}
		else if(s.equalsIgnoreCase("Bihar"))
		{
			center="BR";
		}
		else if(s.equalsIgnoreCase("Delhi"))
		{
			center="DL";
		}
		else if(s.equalsIgnoreCase("telangana"))
		{
			center="TS";
		}
		else {
			center="INDIA";
		}
		
		
		String vehicalregnumber=center+" "+rand_int2+" "+ randomString+" "+rand_int1;
		return vehicalregnumber;
	}
}
