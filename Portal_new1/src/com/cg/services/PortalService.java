package com.cg.services;

import java.util.ArrayList;
import java.util.List;

import com.cg.entities.Problem;
import com.cg.entities.Solution;

public interface PortalService {

	/*
	 * 1. addProblem
	 * 2. addSolution
	 * 3. retreiveAllSolutions
	 * 4. deleteProblem
	 * 5. viewSolution
	 * 6. viewProblem
	 * 7. retreiveAllProblems
	 */
	
	public Problem addProblem(Problem problem);

	public Solution addSolution(Solution solution);
	
	public List<Solution> loadAll();
	List<Problem> viewAllProblem();

	public Problem viewProblem(Long pId);

	public List<Solution> viewSolution(Long pId);
	public Solution viewSingleSolution(Long sId);
	public List<Solution> viewAllSolutions();

}
