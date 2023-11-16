package com.mdtalalwasim.cricksportlive.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdtalalwasim.cricksportlive.entity.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer>{
	
	//fetch the match by TeamHeading / Team Name;
	Optional<Match> findByTeamHeading(String teamHeading);

}
