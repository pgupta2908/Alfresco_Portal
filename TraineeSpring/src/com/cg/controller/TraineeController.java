package com.cg.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.omg.CosNaming.Binding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.BindingResultUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Trainee;
import com.cg.service.TraineeService;

@Controller
public class TraineeController {
	
	@Autowired
	TraineeService service;
	
	@RequestMapping("/index")
	public String displayLoginPage(){
		return "index";
	}
	
	@RequestMapping("/menu")
	public String homePage(){
		return "menu";
	}
	
	@RequestMapping("/valid")
	public String validateLogin(@RequestParam("username")String username,@RequestParam("password")String password,Model model){
		if(username.equals("saichand") && password.equals("sai")){
			return "menu";
		}
		else{
			model.addAttribute("message","Invalid Login Credentials.. please try again later");
			return "redirect:/index.html";
		}
	}
	
	@RequestMapping("/insert")
	public String redirectToInsertPage(Model model){
		model.addAttribute("trainee",new Trainee());
		return "addTrainee";
	}
	
	@RequestMapping("/save")
	public String insertToDB(@ModelAttribute("trainee")@Valid Trainee trainee,BindingResult result,Model model){
		if(!result.hasErrors()){
			boolean isInserted = service.addTrainee(trainee);
			if(isInserted){
				model.addAttribute("message","Record Inserted Successfully");
				return "menu";
			}
			else return "redirect:/addTrainee.html";
		}
		else return "addTrainee";
	}
	
	@RequestMapping("/delete")
	public String redirectToDeletePage(){
		return "removeTrainee";
	}
	
	@RequestMapping("/remove")
	public String deleteFromDB(@RequestParam("traineeId")Integer traineeId,Model model){
		Trainee trainee = service.viewSpecificRecord(traineeId);
		if(trainee!=null){
			model.addAttribute("trainee",trainee);
		}
		else model.addAttribute("message","Record not found...");
		return "removeTrainee";
	}
	
	@RequestMapping("/confirmDelete")
	public String confirmDelete(@RequestParam("traineeId")Integer traineeId, Model model){
		boolean isDeleted = service.deleteTrainee(traineeId);
		if(isDeleted){
			model.addAttribute("message","Record deleted successfully...");
			return "menu";
		}
		else{
			model.addAttribute("message","Record deletion unsuccessfull");
			return "removeTrainee";
		}

	}
	
	@RequestMapping("/modify")
	public String redirectToUpdatePage(){
		return "updateTrainee";
	}
	
	@RequestMapping("/update")
	public String updateDetails(@RequestParam("traineeId")Integer traineeId,Model model){
		Trainee trainee = service.viewSpecificRecord(traineeId);
		model.addAttribute("trainee",trainee);
		model.addAttribute("message","Record not found...");
		return "updateTrainee";
	}
	
	@RequestMapping("/confirmUpdate")
	public String confirmUpdate(@ModelAttribute("trainee")Trainee trainee,Model model){
		boolean ifUpdated = service.updateTrainee(trainee);
		if(ifUpdated){
			model.addAttribute("message","Record Updated successfully...");
			return "menu";
		}
		else{
			model.addAttribute("message","Record deletion unsuccessfull");
			return "updateTrainee";
		}
	}
	
	@RequestMapping("/retrieve")
	public String redirectToRetrievePage(){
		return "retrieve";
	}
	
	@RequestMapping("/getTrainee")
	public String retrieveTrainee(@RequestParam("traineeId")Integer traineeId,Model model){
		Trainee trainee = service.viewSpecificRecord(traineeId);
		if(trainee!=null){
			model.addAttribute("trainee",trainee);
		}
		else model.addAttribute("message","Record not found...");
		return "retrieve";	
	}
	
	@RequestMapping("/viewall")
	public String redirectToRetrieveAll(Model model){
		ArrayList<Trainee> tlist = (ArrayList<Trainee>) service.viewAllTrainees();
		model.addAttribute("traineeList",tlist);
		return "retrieveAll";
	}
	
}
