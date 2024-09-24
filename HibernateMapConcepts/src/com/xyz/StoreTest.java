package com.xyz;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class StoreTest {

	public static void main(String[] args) {
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		
		HashMap<String,String>map1=new HashMap<String, String>();
		
		map1.put("Java is a Programming language","John");
		
		map1.put("Java is a platform","Ashok kumar");
		
		HashMap<String,String>map2=new HashMap<String, String>();
		map2.put("Servlet tech","mohamed");
		map2.put("Servlet is interface","azar");
		
		Question question1=new Question("What is java??","Alok",map1);
		
		Question question2=new Question("What is Servlet??","kumar",map2);
		
		session.persist(question1);
		
		session.persist(question2);
		
		t.commit();
		
		session.close();
		
		System.out.println("Inserted...");
		
		

	}

}
