package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Trainee {
	@Id
	@SequenceGenerator(name="id_gen",sequenceName="trainee_id_seq",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="id_gen")
	@Column(name="TRAINEEID")
	private Integer traineeId;
	
	@Column(name="TRAINEENAME")
	@NotEmpty(message="trainee name is mandatory")
	@Pattern(regexp="[A-Z]{1}[A-Za-z ]{5,30}",message="Please Enter Valid Name")
	private String traineeName;
	
	@Column(name="TRAINEEDOMAIN")
	@NotEmpty(message="Required to select atlease one technology")
	private String traineeDomain;
	
	@Column(name="TRAINEELOCATION")
	@NotEmpty(message="Please select atleaste one location")
	private String traineeLocation;
	
	public Integer getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName="
				+ traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}
	
	
}
