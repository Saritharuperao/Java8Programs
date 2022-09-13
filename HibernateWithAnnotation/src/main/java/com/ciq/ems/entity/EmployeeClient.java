package com.ciq.ems.entity;




	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;

	public class EmployeeClient {
		public static void main(String[] args) {
			Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			System.out.println(session);

			// Employee employee=new Employee("arun", 15000.00,"arun@gmail.com");
//			 Transaction tx = session.beginTransaction();
//			 session.save(employee);
//			 tx.commit();
//			 System.out.println(session);
//			 session.close();
	
	Employee employees = new Employee("anil", 18000.00, "anil@gmail.com");
//			session.save(employees);
//			session.beginTransaction().commit();
//			System.out.println(session);
//			session.close();

			// RETRIVE EMPLOYEES DATA
			
//Employee employee=(Employee) session.get(Employee.class, 1);
	//System.out.println(employee);
	
	
//			 
//			// GET ALL EMPLOYEES DATA
	//	 Employee employee1=(Employee) session.get(Employee.class, 3);
	// System.out.println(employee1);
		 

			// update process
//		 Employee employee=new Employee(3,"manu",20000.00,"manu@gmail.com");
//		 session.update(employee);
//		 session.beginTransaction().commit();
//			session.close();
//			System.out.println(employee);
//			

			// save or update
			
	Employee employee=new Employee("vennela", 23000.00, "ven@gmail.com");
	session.saveOrUpdate(employee);
	session.beginTransaction().commit();
	//System.out.println(employee);
	session.close();
		}

	}

