package com.cg.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.TraineeRepository;
import com.cg.entities.Trainee;

@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
	
	@Autowired
	TraineeRepository repository;
	
	@Override
	public boolean addTrainee(Trainee t) {
		// TODO Auto-generated method stub
		return repository.addTrainee(t);
	}

	@Override
	public boolean deleteTrainee(Integer traineeId) {
		// TODO Auto-generated method stub
		return repository.deleteTrainee(traineeId);
	}

	@Override
	public boolean updateTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		return repository.updateTrainee(trainee);
	}

	@Override
	public Trainee viewSpecificRecord(Integer traineeId) {
		// TODO Auto-generated method stub
		return repository.viewSpecificRecord(traineeId);
	}

	@Override
	public List<Trainee> viewAllTrainees() {
		// TODO Auto-generated method stub
		return repository.viewAllTrainees();
	}

}
