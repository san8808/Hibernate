package oneToMany;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import dao.employeeDAOImpl;
import model.Department;
import model.Employee;

import java.util.*;
 
public class main {
	
	 static SessionFactory sf;

    public static void main(String[] args) {
        
       employeeDAOImpl empl=new employeeDAOImpl();
       
       //empl.addEmployee();
       List l=empl.listEmp();
       
      
       
       for(int i=0;i<l.size();i++) {
    	   Employee e=new Employee();
    	   e=(Employee) l.get(i);
//    	   System.out.println(e.getEmp_id());
    	   System.out.println(e.getFname()+" "+e.getLname());
//    	   System.out.println(e.getLname());
//    	   System.out.println(e.getD().getDname());
       }   
    }
    
   
    
    
    
    
    
}