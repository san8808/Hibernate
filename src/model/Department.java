package model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int dept_id;
	private String Dname;
	@OneToMany(mappedBy="d")
	Set<Employee> s;
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	public String getDname() {
		return Dname;
	}
	public Set getS() {
		return s;
	}
	public void setS(Set s) {
		this.s = s;
	}
	public void setDname(String dname) {
		Dname = dname;
	}
	
}
