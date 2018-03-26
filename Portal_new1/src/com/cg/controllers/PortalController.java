package com.cg.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Problem;
import com.cg.entities.Solution;
import com.cg.services.PortalService;

@Controller
public class PortalController {

	@Autowired
	PortalService service;
	
	@RequestMapping("/index")
	public String displayLoginPage()
	{
		return "index";
	}

	@RequestMapping("/valid")
	public String validateLogin(@RequestParam("username")String username,@RequestParam("password")String password,Model model,HttpSession session)
	{
		if(username.equals("qwe") && password.equals("qwe"))
		{
			System.out.println("hihih");
			session.setAttribute("username", username);
			System.out.println("name : "+session.getAttribute("username"));
			return "redirect:/home.html";
		}
		else
		{
			model.addAttribute("message","Invalid Login Credentials.. please try again later");
			return "redirect:/index.html";
		}
	}
	
	@RequestMapping("/logout")
    public String logout(HttpSession session ) {
    
       session.invalidate();
       return "index";
    }
	
	@RequestMapping("/home")
	public String retrieveAll(Model model)
	{
		List<Problem> plist = (List<Problem>) service.viewAllProblem();
		System.out.println(plist);
		model.addAttribute("problemList",plist);
		return "home";
	}
	
	@RequestMapping("/addProblem")
	public String addProblem(Model model)
	{
		model.addAttribute("problem", new Problem());
		return "addProblem";		
	}
	
	@RequestMapping("/addProb")
	public String add(@ModelAttribute("problem")Problem problem, Model model)
	{
		
		System.out.println("in here");
		problem=service.addProblem(problem);
		model.addAttribute("message","Problem added successfully!");
		return "addProblem";
	}
	/*@RequestMapping("/viewProblem")
	public String viewProblem()
	{
		return "viewProblem";		
	}*/
	
	/*@RequestMapping("/viewProblem")
	public String retrieveProblem(Model model){
		List<Problem> plist = (List<Problem>) service.viewProblem();
		System.out.println(plist);
		model.addAttribute("problemList",plist);
		return "viewProblem";
	}*/
	
	@RequestMapping("/viewProblem")
	public String retrieveProblem(@RequestParam("pId")Long pId,Model model){
		Problem prob = service.viewProblem(pId);
		System.out.println(prob);
		model.addAttribute("problem",prob);
		return "viewProblem";
	}
		
	@RequestMapping("/addSolution")
	public String addSolution(@RequestParam("pId") Long pId, @RequestParam("empId")Long empId,Model model)
	{
		model.addAttribute("pId",pId);
		model.addAttribute("empId",empId);
		model.addAttribute("solution", new Solution());
		return "addSolution";		
	}
	
	@RequestMapping("/addSol")
	public String add(@ModelAttribute("solution")Solution solution, Model model)
	{
		/*model.addAttribute("pId",pId);*/
		service.addSolution(solution);
		model.addAttribute("message","Solution added successfully!");
		model.addAttribute("sId",solution.getsId());
		return "addSolution";
	}
	
	@RequestMapping("/solutions")
	public String viewAllSolutions(@RequestParam("pId")Long pId,Model model){
		
		List<Solution> slist = (List<Solution>) service.viewSolution(pId);
		System.out.println(slist);
		model.addAttribute("solutionList",slist);
		model.addAttribute("pId",pId);
		model.addAttribute("solution",new Solution());
		return "solution";
	}
	
	@RequestMapping("/viewSolution")
	public String viewProblem(@RequestParam("sId")Long sId, Model model){
		Solution sol = service.viewSingleSolution(sId);
		System.out.println(sol);
		model.addAttribute("solution",sol);
		return "viewSolution";
	}
	
	
}
