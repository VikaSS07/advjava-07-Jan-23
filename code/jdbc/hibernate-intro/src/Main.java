import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.entity.Employee;

public class Main {

	public static void main(String[] args) {
		ServiceRegistry registry = 
				new StandardServiceRegistryBuilder().configure("hibernate-cfg.xml").build();
		Metadata metadata = new MetadataSources(registry).buildMetadata();
		SessionFactory factory = metadata.buildSessionFactory();
		Session session = factory.openSession();
		
		Employee emp = new Employee();
		emp.setName("A");
		emp.setEmail("A@gmail");
		
		session.save(emp);
		session.close();
		factory.close();
		
		
	}

}
