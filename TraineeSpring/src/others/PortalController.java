package others;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.entities.Problem;
import com.cg.entities.Solution;
import com.cg.exceptions.PortalException;
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
	
	@RequestMapping("/home")
	public String home()
	{
		return "home";
	}

	@RequestMapping("/valid")
	public String validateLogin(@RequestParam("username")String username,@RequestParam("password")String password,Model model){
		if(username.equals("sol") && password.equals("sol")){
			return "home";
		}
		if(username.equals("prob") && password.equals("prob")){
			return "home";
		}
		else
		{
			model.addAttribute("message","Invalid Login Credentials.. please try again later");
			return "redirect:/index.html";
		}
	}
	
	@RequestMapping("/addProblem")
	public String addProblem(Model model)
	{
		model.addAttribute("problemRequest", new AddProblemRequest());
		return "addProblem";		
	}

	@RequestMapping("/addProb")
	public String addProb(@ModelAttribute("problemRequest")@Valid AddProblemRequest problemRequest, Model model) throws PortalException, ParseException
	{	
		System.out.println("In problem");
		System.out.println(problemRequest);
		Problem prob1 = new Problem();
		prob1.setEmpid(problemRequest.getEmpid());
		prob1.setPContent(problemRequest.getPContent());
		prob1.setPid(problemRequest.getPid());
		
		Date eDate=new SimpleDateFormat("dd/MM/yyyy").parse(problemRequest.getEdate());
		Date sDate=new SimpleDateFormat("dd/MM/yyyy").parse(problemRequest.getEdate());
		
		prob1.setEdate(eDate);
		prob1.setSdate(sDate);
		prob1.setPDescription(problemRequest.getPDescription());
		System.out.println(sDate);
		service.addProblem(prob1);
		model.addAttribute("message","Problem added successfully!");
		return "redirect:/addProblem.html";
	}

	@RequestMapping("/addSolution")
	public String addSolution(Model model)
	{
		model.addAttribute("solution", new Solution());
		return "addSolution";		
	}

	@RequestMapping("/addSol")
	public String addSol(@ModelAttribute("solution")Solution solution, Model model) throws PortalException
	{

		solution=service.addSolution(solution);
		model.addAttribute("message","Solution added successfully!");


		return "redirect:/addSolution.html";
	}

	@RequestMapping("/retrieveAllSolutions")
	public String retrieveAllSolutions(Model model) throws PortalException
	{
		List<Solution> tList;

		tList = (List<Solution>) service.loadAll();
		model.addAttribute("list",tList);


		return "solutions";
	}


}
