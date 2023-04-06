package com.voting.votingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voting.votingsystem.entity.Citizen;

@Repository
public interface CitizenRepo extends JpaRepository<Citizen, Integer>{


}
