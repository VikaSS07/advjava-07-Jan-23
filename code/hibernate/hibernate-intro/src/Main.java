import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import xyz.Employee;

public class Main {
	public static void main(String[] args) {
		
		/*Employee emp = new Employee();
		emp.setId(212);
		emp.setName("A");
		emp.setEmail("A@gmail.com");
		emp.setContact("7777766666");*/
		
		Configuration cfg = new Configuration();
		cfg.configure("hbm-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
			//session.save(emp); // to INSERT query
			//session.update(emp); // to UPDATE query
			//session.delete(emp); // to DELETE query
			Employee e = session.get(Employee.class, 1212); // to SELECT with WHERE clause
			
			
			System.out.println("Id : " + e.getId());
			System.out.println("Name : " + e.getName());
			System.out.println("Email : " + e.getEmail());
			System.out.println("Contact : " + e.getContact());
			
		session.getTransaction().commit();
		
		session.close();
		sf.close();
		
		
		
	}
}




