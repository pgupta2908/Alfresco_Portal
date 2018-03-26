package others;

public class AddProblemRequest {
	
	
	Long Pid;
	
	Long Empid;
	
	String PDescription;
	
	String Sdate;
	
	String Edate;
	
	String PContent;

	public Long getPid() {
		return Pid;
	}

	public void setPid(Long pid) {
		Pid = pid;
	}

	public Long getEmpid() {
		return Empid;
	}

	public void setEmpid(Long empid) {
		Empid = empid;
	}

	public String getPDescription() {
		return PDescription;
	}

	public void setPDescription(String pDescription) {
		PDescription = pDescription;
	}

	public String getSdate() {
		return Sdate;
	}

	public void setSdate(String sdate) {
		Sdate = sdate;
	}

	public String getEdate() {
		return Edate;
	}

	public void setEdate(String edate) {
		Edate = edate;
	}

	public String getPContent() {
		return PContent;
	}

	public void setPContent(String pContent) {
		PContent = pContent;
	}

	@Override
	public String toString() {
		return "AddProblemRequest [Pid=" + Pid + ", Empid=" + Empid + ", PDescription=" + PDescription + ", Sdate="
				+ Sdate + ", Edate=" + Edate + ", PContent=" + PContent + "]";
	}

}
