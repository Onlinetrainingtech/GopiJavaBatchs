package com.xyz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OneToOneExample {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPARelationShip");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
        
        Student s1=new Student();
        s1.setS_id(1);
        s1.setS_name("azar");
        
        em.persist(s1);

        Library f1=new Library();
        f1.setB_id(101);
        f1.setB_name("java");
        f1.setStud(s1);
        
        em.persist(f1);
        
        
        em.getTransaction().commit();
        
        em.close();
        
        emf.close();
        
        

	}

}
