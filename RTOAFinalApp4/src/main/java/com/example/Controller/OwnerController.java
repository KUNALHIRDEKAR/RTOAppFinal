package com.example.Controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.OwnerDomain;
import com.example.entity.OwnerEntity;
import com.example.repository.OwnerRepository;
@Controller
public class OwnerController {
	@Autowired
	OwnerRepository ownerRepository;
	@RequestMapping("/getOwnerFormPage")
	public String loadOwnerForm(@ModelAttribute("ownerDomain")OwnerDomain ownerDomain, Model model,HttpSession ses)
	{
				
		
		model.addAttribute("ownerDomain",new OwnerDomain());
		
		return "ownerFormPage";
	}
	@RequestMapping(value="/saveFormEntity",method = RequestMethod.POST)
	public String  saveFormEntity(@ModelAttribute("ownerDomain") OwnerDomain ownerDomain,
			HttpSession ses) 
	{
		OwnerEntity ownerEntity1=new OwnerEntity();
		
		BeanUtils.copyProperties(ownerDomain, ownerEntity1);
		if(ownerRepository.findByEmail(ownerEntity1.getEmail())!=null) {return "unique";}
		
		OwnerEntity ownerEntity= ownerRepository.save(ownerEntity1);
		//redirectAttributes.addFlashAttribute("ownerDomain", ownerDomain);
	
		ses.setAttribute("ownerID",ownerEntity.getOwnerID());
		ses.setAttribute("ownerEntity",ownerEntity);
		
		return"redirect:/getAddrsFormPage";
	}

}
