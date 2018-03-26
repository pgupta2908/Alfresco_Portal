package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Problem;
import com.cg.entities.Solution;

@Repository
public class PortalDaoImpl implements PortalDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Problem addProblem(Problem problem) {
		entityManager.persist(problem);
		entityManager.flush();	
		return problem;
	}

	@Override
	public Solution addSolution(Solution solution) {
		entityManager.persist(solution);
		entityManager.flush();	
		return solution;
	}

	@Override
	public List <Solution> loadAll() {
		TypedQuery<Solution> query = entityManager.createQuery("SELECT s FROM Solution s", Solution.class);
		return query.getResultList();
		
	}

	@Override
	public List<Problem> viewAllProblem() {
		String query = "SELECT p FROM Problem p";
		TypedQuery<Problem> typedQuery = entityManager.createQuery(query, Problem.class);
		return typedQuery.getResultList();
	}

	@Override
	public Problem viewProblem(Long pId) {
		Problem prob = entityManager.find(Problem.class, pId);
		return prob;
	}

	@Override
	public List<Solution> viewSolution(Long pId) {
//		String query = "SELECT s FROM Solution s WHERE pId= :pId";
		TypedQuery<Solution> typedQuery = entityManager.createQuery("SELECT s FROM Solution s WHERE pId= :pId", Solution.class);
		typedQuery.setParameter("pId", pId);
		return typedQuery.getResultList();
	}

	@Override
	public List<Solution> viewAllSolutions() {
		String query = "SELECT s FROM Solution s";
		TypedQuery<Solution> typedQuery = entityManager.createQuery(query, Solution.class);
		return typedQuery.getResultList();
	}

	@Override
	public Solution viewSingleSolution(Long sId) {
		Solution sol=entityManager.find(Solution.class, sId);
		return sol;
	}

	
}
