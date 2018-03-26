package com.cg.service;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeService {
	boolean addTrainee(Trainee t);
	boolean deleteTrainee(Integer traineeId);
	boolean updateTrainee(Trainee trainee);
	Trainee viewSpecificRecord(Integer traineeId);
	List<Trainee> viewAllTrainees();

}
