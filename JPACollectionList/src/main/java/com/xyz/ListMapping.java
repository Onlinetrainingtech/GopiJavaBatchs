package com.xyz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ListMapping {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPACollectionList");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
        
        Address a1=new Address();
        a1.setE_pincode(201023);
        a1.setE_city("Nodia");
        a1.setE_state("UP");
        
        Address a2=new Address();
        a2.setE_pincode(401023);
        a2.setE_city("Hyd");
        a2.setE_state("AP");
        
        
        Employee e1=new Employee();
        e1.setE_id(1);
        e1.setE_name("azar");
        e1.getAddress().add(a1);
        
        Employee e2=new Employee();
        e2.setE_id(2);
        e2.setE_name("Mohamed");
        e2.getAddress().add(a2);
        
        em.persist(e1);
        
        em.persist(e2);
        
        em.getTransaction().commit();
        
        em.close();
        
        emf.close();
        
        
	}

}
