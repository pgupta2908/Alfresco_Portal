package com.cg.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.PortalDao;
import com.cg.entities.Problem;
import com.cg.entities.Solution;

@Service
@Transactional
public class PortalServiceImpl implements PortalService {

	@Autowired
	PortalDao dao;

	@Override
	public Problem addProblem(Problem problem) {
		return dao.addProblem(problem);
	}

	@Override
	public Solution addSolution(Solution solution) {
		return dao.addSolution(solution);
	}

	@Override
	public List<Solution> loadAll() {
		return dao.loadAll();
	}

	@Override
	public List<Problem> viewAllProblem() {
		// TODO Auto-generated method stub
		return dao.viewAllProblem();
	}

	@Override
	public Problem viewProblem(Long pId) {
		// TODO Auto-generated method stub
		return dao.viewProblem(pId);
	}

	@Override
	public List<Solution> viewSolution(Long pId) {
		// TODO Auto-generated method stub
		return dao.viewSolution(pId);
	}

	@Override
	public List<Solution> viewAllSolutions() {
		// TODO Auto-generated method stub
		return dao.viewAllSolutions();
	}

	@Override
	public Solution viewSingleSolution(Long sId) {
		// TODO Auto-generated method stub
		return dao.viewSingleSolution(sId);
	}

	

}
