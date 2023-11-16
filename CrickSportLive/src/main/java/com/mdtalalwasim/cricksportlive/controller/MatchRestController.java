package com.mdtalalwasim.cricksportlive.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mdtalalwasim.cricksportlive.entity.Match;
import com.mdtalalwasim.cricksportlive.service.MatchService;

@RestController
@RequestMapping("/api")
public class MatchRestController {
	
	@Autowired
	private MatchService matchService;
	
	//get live matches
	@GetMapping("/match/live")
	public ResponseEntity<List<Match>> getLiveMatches(){
		return new ResponseEntity<List<Match>>(this.matchService.getLiveMatches(), HttpStatus.OK);
	}

	
	//get all matches
	@GetMapping("/match/all-matches")
	public ResponseEntity<List<Match>> getAllMatches(){
		return new ResponseEntity<List<Match>>(this.matchService.getAllMatches(), HttpStatus.OK);
	}	

	//get all matches
		@GetMapping("/match/point-table")
		public ResponseEntity<List<List<String>>> getPointTable(){
			return new ResponseEntity<List<List<String>>>(this.matchService.getPointTable(), HttpStatus.OK);
		}	

}
