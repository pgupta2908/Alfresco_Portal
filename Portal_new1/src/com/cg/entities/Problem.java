package com.cg.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Problem implements Serializable{
	
	private static final long serialVersionUID = -8311263678494125976L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pId")
	private Long pId;
	
	@Column(name="empId")
	private Long empId;
	
	@Column(name="pDescription")
	private String pDescription;
	
	@Column(name="pStartDate")
	Date sDate;
	
	@Column(name="pEndDate")
	Date eDate;
	
	@Column(name="pContent")
	private String pContent;

	public Long getpId() {
		return pId;
	}

	public void setpId(Long pId) {
		this.pId = pId;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public Date getsDate() {
		return sDate;
	}

	public void setsDate(Date sDate) {
		this.sDate = sDate;
	}

	public Date geteDate() {
		return eDate;
	}

	public void seteDate(Date eDate) {
		this.eDate = eDate;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}

	@Override
	public String toString() {
		return "Problem [pId=" + pId + ", empId=" + empId + ", pDescription=" + pDescription + ", sDate=" + sDate
				+ ", eDate=" + eDate + ", pContent=" + pContent + "]";
	}


	
	
	
	
	
	
}
