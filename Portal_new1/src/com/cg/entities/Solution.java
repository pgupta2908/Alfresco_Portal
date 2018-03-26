package com.cg.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Solution implements Serializable{
	private static final long serialVersionUID = -2076020035785157855L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="sId")
	Long sId;
	@Column(name="empId")
	Long empId;
	@Column(name="pId")
	Long pId;
	@Column(name="sDescription")
	String sDescription;
	@Column(name="sContent")
	String sContent;
	@Column(name="sLink")
	String sLink;
	@Column(name="voteCount")
	String vCount;
	
	public Long getsId() {
		return sId;
	}
	public void setsId(Long sId) {
		this.sId = sId;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public Long getpId() {
		return pId;
	}
	public void setpId(Long pId) {
		this.pId = pId;
	}
	public String getsDescription() {
		return sDescription;
	}
	public void setsDescription(String sDescription) {
		this.sDescription = sDescription;
	}
	public String getsContent() {
		return sContent;
	}
	public void setsContent(String sContent) {
		this.sContent = sContent;
	}
	public String getsLink() {
		return sLink;
	}
	public void setsLink(String sLink) {
		this.sLink = sLink;
	}
	public String getvCount() {
		return vCount;
	}
	public void setvCount(String vCount) {
		this.vCount = vCount;
	}

	@Override
	public String toString() {
		return "Solution [sId=" + sId + ", empId=" + empId + ", pId=" + pId + ", sDescription=" + sDescription
				+ ", sContent=" + sContent + ", sLink=" + sLink + ", vCount=" + vCount + "]";
	}
}
