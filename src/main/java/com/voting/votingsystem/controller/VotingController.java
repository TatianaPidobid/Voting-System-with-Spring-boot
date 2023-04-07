package com.voting.votingsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.voting.votingsystem.entity.Citizen;
import com.voting.votingsystem.repositories.CandidateRepo;
import com.voting.votingsystem.repositories.CitizenRepo;

@Controller
public class VotingController {

	@Autowired
	CitizenRepo citizenRepo;
	
	@Autowired
	CandidateRepo candidateRepo;
	
	@RequestMapping("/")
	public String goToVote() {
		return "vote.html";
	}

	
	@RequestMapping("/doLogin")
	public String doLogin(@RequestParam String name) {
		Citizen citizen = citizenRepo.findByName(name);
		
		if(!citizen.getHasVoted()) {
			System.out.println("false!");
			return "/performVoted.html";
		} else {
			System.out.println("true!");
			return "/alreadyVoted.html";
		}
	}
}
