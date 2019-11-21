package com.example.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.AddressDomain;
import com.example.domain.OwnerDomain;
import com.example.entity.AddressEntity;
import com.example.entity.OwnerEntity;
import com.example.repository.AddrsRepository;


@Controller
public class AddressController {
	@Autowired
	AddrsRepository addressEntityDao;

	@RequestMapping("/getAddrsFormPage")
	public String loadAddrsForm(Model model, HttpSession ses) {
		//String s1 = req.getParameter("ownerID");
		OwnerEntity ownerEntity =(OwnerEntity) ses.getAttribute("ownerEntity");
		int ownerID =ownerEntity.getOwnerID();
		AddressDomain addressDomain = new AddressDomain();
		addressDomain.setOwnerID(ownerID);
		model.addAttribute("addressDomain",addressDomain);
		return "addressFormPage";
	}

	@RequestMapping("/saveOwnerFormEntity")
	public String saveAddrsEntity(@ModelAttribute("addressDomain") AddressDomain addressDomain,
			final RedirectAttributes redirectAttributes, HttpSession ses) {
		AddressEntity addressEntity = new AddressEntity();
		
		BeanUtils.copyProperties(addressDomain, addressEntity);
		OwnerEntity ownerEntity =(OwnerEntity) ses.getAttribute("ownerEntity");
		
		addressEntity.setDetail(ownerEntity);
		addressEntityDao.save(addressEntity);
		ses.setAttribute("addressEntity",addressEntity);
		ses.setAttribute("addressID",addressEntity.getAddressId());
		redirectAttributes.addFlashAttribute("addressDomain", addressDomain);
		ses.setAttribute("addrsID", addressEntity.getAddressId());
		return "redirect:/loadvehicalForm";
	}
	@RequestMapping("/previousFormPage")
	public String previousFormPage(HttpSession ses,Model model)
	{
		ses.getAttribute("ownerID");
		
		return "redirect:/getOwnerFormPage"; 
	}
}
