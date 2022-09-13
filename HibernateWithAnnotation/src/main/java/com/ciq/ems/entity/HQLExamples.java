package com.ciq.ems.entity;

import org.hibernate.Session;

import com.ciq.ems.util.HibernateUtil;
import com.mysql.cj.Query;

import org.hibernate.SessionFactory;
 import org.hibernate.cfg.Configuration;

public class HQLExamples {
private static Session session = null;

	public static void main(String[] args) {
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Session openSession = HibernateUtil.closeSession(session);
		System.out.println(session);
		

		Query query =  session.createQuery("from Employee");
		
				
	}

}
