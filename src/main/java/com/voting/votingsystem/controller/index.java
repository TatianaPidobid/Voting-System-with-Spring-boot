package com.voting.votingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.voting.votingsystem.entity.Citizen;
import com.voting.votingsystem.repositories.CitizenRepo;

@RestController
public class index {

	@Autowired
	CitizenRepo citizenRepo;
	
	@RequestMapping("/doAction")
	public String doAction() {
		Citizen city = new Citizen((long)1, "Bob");
		citizenRepo.save(city);

		return "Succes";
	}
}
