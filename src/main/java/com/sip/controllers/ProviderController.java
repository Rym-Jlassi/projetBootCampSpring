package com.sip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sip.entities.Provider;
import com.sip.repositories.ProviderRepository;

@Controller
@RequestMapping("/provider")
public class ProviderController {
	@Autowired	
	ProviderRepository providerRepository; 
	
	@RequestMapping("/add")
	@ResponseBody
	public String add() {
		Provider provider = new Provider("Samsung","Korea","samsung@gmail.com");
		Provider inserted = providerRepository.save(provider);
		return "Add Provider"+inserted;
	}

}
