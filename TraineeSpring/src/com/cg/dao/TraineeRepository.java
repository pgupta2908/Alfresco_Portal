package com.cg.dao;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeRepository {
	boolean addTrainee(Trainee t);
	boolean updateTrainee(Trainee trainee);
	Trainee viewSpecificRecord(Integer traineeId);
	List<Trainee> viewAllTrainees();
	boolean deleteTrainee(Integer traineeId);

}
