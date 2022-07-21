package criteria;

import javax.persistence.*;

@Entity
@Table(name="Emp_info")
public class Employee {
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, String fname, int salary) {
		super();
		this.id = id;
		this.fname = fname;
		this.salary = salary;
	}
	public Employee(String fname, int salary) {
		super();
		this.fname = fname;
		this.salary = salary;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String fname;
	private int salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
