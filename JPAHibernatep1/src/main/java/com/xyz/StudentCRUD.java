package com.xyz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentCRUD {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAHibernatep1");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin(); 
        
        StudentEntity s1=new StudentEntity();
        s1.setId(1001);
        s1.setName("azar");
        s1.setAge(24);
        
        em.persist(s1);

        em.getTransaction().commit();
        
        emf.close();
        
        em.close();
	}

}
