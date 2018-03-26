/**
 * 
 */
package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;

/**
 * @author vmatti
 *
 */
@Repository
public class TraineeRepositoryImpl implements TraineeRepository {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public boolean addTrainee(Trainee t) {
		// TODO Auto-generated method stub
		entityManager.persist(t);
		return true;
	}

	/* (non-Javadoc)
	 * @see com.cg.dao.TraineeRepository#deleteTrainee(java.lang.Integer)
	 */
	@Override
	public boolean deleteTrainee(Integer traineeId) {
		// TODO Auto-generated method stub
		Trainee trainee1 = entityManager.find(Trainee.class, traineeId); 
		if(trainee1!=null){
			entityManager.remove(trainee1);
			entityManager.flush();
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.cg.dao.TraineeRepository#updateTrainee(java.lang.Integer, com.cg.entities.Trainee)
	 */
	@Override
	public boolean updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub	
		if(trainee!=null){
			entityManager.merge(trainee);
			entityManager.flush();
			return true;
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see com.cg.dao.TraineeRepository#viewSpecificRecord(java.lang.Integer)
	 */
	@Override
	public Trainee viewSpecificRecord(Integer traineeId) {
		// TODO Auto-generated method stub
		Trainee trainee2 = entityManager.find(Trainee.class, traineeId);
		return trainee2;
	}

	/* (non-Javadoc)
	 * @see com.cg.dao.TraineeRepository#viewAllTrainees()
	 */
	@Override
	public List<Trainee> viewAllTrainees() {
		// TODO Auto-generated method stub
		String query = "SELECT t FROM Trainee t";
		TypedQuery<Trainee> typedQuery = entityManager.createQuery(query, Trainee.class);
		return typedQuery.getResultList();		
	}

}
