package model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="findEmp", query="From Employee where d.Dname like :name ")
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Emp_id;
	private String Fname;
	private String lname;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dept_id")
	Department d;
	
	public Department getD() {
		return d;
	}
	public void setD(Department d) {
		this.d = d;
	}
	public int getEmp_id() {
		return Emp_id;
	}
	public void setEmp_id(int emp_id) {
		Emp_id = emp_id;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	
}