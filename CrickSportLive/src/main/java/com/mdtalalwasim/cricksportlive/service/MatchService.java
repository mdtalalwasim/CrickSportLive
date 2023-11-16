package com.mdtalalwasim.cricksportlive.service;

import java.util.List;
import java.util.Map;

import com.mdtalalwasim.cricksportlive.entity.Match;



public interface MatchService {
	
	//get LiveMatches
	List<Match> getLiveMatches();
	
	//get AllMatches
	List<Match> getAllMatches();
	
	//PointTable
	//get cricket world cup 2023 point table
	List<List<String>> getPointTable();

}
