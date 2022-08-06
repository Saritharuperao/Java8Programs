package com.ciq.ems.util;

import org.apache.log4j.chainsaw.Main;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private static SessionFactory sessionFactory;
	private static Session session;
	static
	{
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
}
	public static Session openSession() {
		
		
		if(session==null)
			session = sessionFactory.openSession();
		return session;
		
	}
	public static Session closeSession(Session session){
		if(session !=null) 
			System.out.println(session.close());
			
		return session;
		
		}
	public static void main(String args[]) {
		System.out.println(openSession());
		
	}
}
