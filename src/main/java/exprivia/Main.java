package exprivia;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		try {
			
			SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM lportal.dlfileentry WHERE dlfileentry.createDate <= now();");
			sqlQuery.addEntity(Dlfileentry.class);
			@SuppressWarnings("unchecked")
			List<Dlfileentry> entries = sqlQuery.list();
			System.out.println("Number of Dlfileentries: " + entries.size());
			for(Dlfileentry dlfileentry: entries){
				System.out.println("Title: " + dlfileentry.getTitle());
				System.out.println("UserName " + dlfileentry.getUserName());
				System.out.println("CreateDate " + dlfileentry.getCreateDate());
				System.out.println("=========================================");
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			session.close();
		}

	}

}
