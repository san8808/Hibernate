package criteria;



import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import javassist.bytecode.Descriptor.Iterator;

public class EmployeeDAO {
	
	static SessionFactory sf;
	public static void main(String args[]) {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		sf=cfg.buildSessionFactory();
		
		EmployeeDAO m=new EmployeeDAO();
		
		
		m.updateEmployee(5, "Sankalp", 12000);
		
		//m.deleteEmployee(4);
		//m.addEmployee("Rahul", 59373);
		m.listEmployee();
		
		
		
	}
	
	public void listEmployee()
    {
        Session s=sf.openSession();
        Transaction tx=s.beginTransaction();

        Criteria cr=s.createCriteria(Employee.class);
        
        //cr.setProjection(Projections.sum("salary"));
        
        
        List ls=cr.list();
        
        System.out.println(ls.get(0));
        
        //cr.add(Restrictions.gt("salary", 30000));
        
        //List ls=s.createQuery("from Employee").list();
        
        System.out.println(ls.size());

//        for(Iterator it=(Iterator) ls.iterator();it.hasNext();)
//        {
//            Employee e=(Employee)it.next();
//            System.out.println(e.getId());
//            System.out.println(e.getFname());
//            System.out.println(e.getLname());
//            System.out.println(e.getSal());
//        }

    }
	
	public Integer addEmployee(String fname,int salary) {
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		
		Employee e =new Employee(fname,salary);
		
		Integer i=(Integer) s.save(e);
		tx.commit();
		s.close();
		
		
		return 0;
	}
	
	
	public void updateEmployee(int id,String fname,int salary) {
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Employee e=new Employee(id,fname,salary);
		s.update(e);
		tx.commit();
		s.close();
		
		
	}
	
	
	public void deleteEmployee(Integer id) {
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Employee e=(Employee)s.get(Employee.class, id);
		s.delete(e);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
