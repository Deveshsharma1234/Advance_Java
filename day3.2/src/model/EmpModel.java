package model;

import java.math.BigDecimal;
import java.sql.Date;

public class EmpModel {
	int emp_id;
	String name;
	String jobTitle;
	String dept;
	BigDecimal sal;
	Date hireDate;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public BigDecimal getSal() {
		return sal;
	}
	public void setSal(BigDecimal bigDecimal) {
		this.sal = bigDecimal;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return "EmpModel [emp_id=" + emp_id + ", name=" + name + ", jobTitle=" + jobTitle + ", dept=" + dept + ", sal="
				+ sal + ", hireDate=" + hireDate + "]";
	}
}
