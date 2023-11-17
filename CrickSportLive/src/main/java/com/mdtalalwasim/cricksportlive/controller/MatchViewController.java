//package com.mdtalalwasim.cricksportlive.viewController;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//
//@Controller
//@RequestMapping("/view")
//public class MatchViewController {
//	
//	@GetMapping("/")
//	public ModelAndView home() {
//		System.out.println("Inside Home....");
//		ModelAndView mv = new ModelAndView();
//		
//		mv.setViewName("admin-pages/match/home.html");
//		
//		return mv;
//	}
//	
//	
//	@GetMapping("/match")
//	public ModelAndView getMatchPointTable() {
//		System.out.println("Inside MatchViewController....");
//		ModelAndView mv = new ModelAndView();
//		
//		mv.setViewName("admin-pages/match/match-point-table");
//		
//		return mv;
//	}
//
//}
package com.mdtalalwasim.cricksportlive.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mdtalalwasim.cricksportlive.service.MatchService;

@Controller
/* @RequestMapping("/view") */

public class MatchViewController {
	
	@Autowired
	MatchService matchService;
	

	
	@GetMapping("/")
	public String home() {
		System.out.println("Inside Home....");
		return "admin-pages/match/home";
	}
	
	@GetMapping("/match-point-table")
	public String getMatchPointTable(Model model) {
		System.out.println("Inside MatchViewController....");
		List<List<String>> pointTable = matchService.getPointTable();
		
		System.out.println("Point Table W: "+pointTable);
		for (List<String> list : pointTable) {
			System.out.println("Wasim..."+list);
		}
		
		model.addAttribute("pointTable", pointTable);
		return "admin-pages/match/match-point-table";
	}
}

