package hibernateCode;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class productDAO {
	
	public static void main(String args[]) {
		
		Configuration cfg=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session sess=sf.openSession();
		
		Transaction tx=sess.beginTransaction();
		
		Product p=new Product();
		
		p.setProduct_name("Mobile");
		p.setProduct_price(12000);
		
		sess.save(p);
		
		tx.commit();	
	}
}
