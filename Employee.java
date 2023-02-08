package maven_project;

import java.util.Date;

public class Employee {
	private int empId;
	private String fname;
	private String lname;
	private String emailid;
	private String phoneno;
	private Date hiredate;
	private int managerid;
	private String jobtitle;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fname=" + fname + ", lname=" + lname + ", emailid=" + emailid
				+ ", phoneno=" + phoneno + ", hiredate=" + hiredate + ", managerid=" + managerid + ", jobtitle="
				+ jobtitle + "]";
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	
	}

