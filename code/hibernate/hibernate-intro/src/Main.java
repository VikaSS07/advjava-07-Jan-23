import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setId(212);
		emp.setName("A");
		emp.setEmail("A@gmail.com");
		emp.setContact("9988998877");
		
		Configuration cfg = new Configuration();
		cfg.configure("hbm-cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		session.beginTransaction();
			session.save(emp);
			//session.update(obj);
			//session.delete(obj);
			//session.get();
		session.getTransaction().commit();
		
		session.close();
		sf.close();
		
		
		
	}
}




