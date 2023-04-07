package com.voting.votingsystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.voting.votingsystem.entity.Candidate;

@Repository
public interface CandidateRepo extends JpaRepository<Candidate, Integer> {

}
