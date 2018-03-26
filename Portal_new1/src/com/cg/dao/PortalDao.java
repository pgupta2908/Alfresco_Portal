package com.cg.dao;

import java.util.List;

import com.cg.entities.Problem;
import com.cg.entities.Solution;

public interface PortalDao {

	public Problem addProblem(Problem problem);

	public Solution addSolution(Solution solution);
	
	public List<Solution> loadAll();
	
	List<Problem> viewAllProblem();
	public Problem viewProblem(Long pId);

	public List<Solution> viewSolution(Long pId);
	public Solution viewSingleSolution(Long sId);
	public List<Solution> viewAllSolutions();
	

}
