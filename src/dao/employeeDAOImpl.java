package dao;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Department;
import model.Employee;

public class employeeDAOImpl implements employeeDAO {
	
	 Configuration cfg;
	 SessionFactory sf;
	 
	public employeeDAOImpl(){
		 cfg=new Configuration().configure("hibernate.cfg.xml");
	     sf=cfg.buildSessionFactory();
	}

	@Override
	public void addEmployee() {
		// TODO Auto-generated method stub
		 Session sess=sf.openSession();
         Transaction tx=sess.beginTransaction();

         Department dept=new Department();
         dept.setDname("Comm");
         Set<Employee> set=new LinkedHashSet<>();


         Employee emp1=new Employee();
         Employee emp2=new Employee();

         emp1.setFname("Bill");
         emp1.setLname("Clinton");
         emp1.setD(dept);

         emp2.setFname("Bill");
         emp2.setLname("gates");
         emp2.setD(dept);

         set.add(emp1);
         set.add(emp2);
         dept.setS(set);

         sess.save(dept);
         sess.save(emp1);
         sess.save(emp2);
         tx.commit();
		
	}

	@Override
	public List<Employee> listEmp() {
		// TODO Auto-generated method stub
		Session sess=sf.openSession();
        Transaction tx=sess.beginTransaction();
        
        //String sd="From Employee where d.Dname like :name ";
        //Query q=sess.createQuery(sd);
        
        Query q=sess.getNamedQuery("findEmp");
        q.setParameter("name", "Comm");
        
        List ls=q.list();
        return ls;
        
	}

}
