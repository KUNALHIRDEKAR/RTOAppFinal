package com.example.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.domain.VhclDomain;
import com.example.entity.OwnerEntity;
import com.example.entity.VhclEntity;
import com.example.repository.VhclRepository;

@Controller
class VhclController {
	@Autowired
	VhclRepository vhclRepository;

	@RequestMapping("/loadvehicalForm")
	public String loadvehicalForm(Model model, HttpSession ses) {
		VhclDomain vhclDomain = new VhclDomain();
		ses.getAttribute("ownerId");
		model.addAttribute("vhclDomain", vhclDomain);
		return "/savevhclFormPage";
	}

	@RequestMapping("/saveVhclFormEntity")
	public String saveVhclFormEntity(@ModelAttribute("vhclDomain") VhclDomain vhclDomain,
			final RedirectAttributes redirectAttributes, HttpSession ses) {
		VhclEntity vhclEntity = new VhclEntity();
		OwnerEntity ownerEntity =(OwnerEntity) ses.getAttribute("ownerEntity");
		vhclEntity.setDetail(ownerEntity);
		BeanUtils.copyProperties(vhclDomain, vhclEntity);
		vhclRepository.save(vhclEntity);
		ses.setAttribute("vhclID",vhclEntity.getVhclId());
		ses.setAttribute("vhclEntity",vhclEntity);
		redirectAttributes.addFlashAttribute("vhclDomain",vhclDomain);
		return "redirect:/sumbitAndReviewPage1";
	}
}
