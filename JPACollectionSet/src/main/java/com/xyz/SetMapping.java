package com.xyz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SetMapping {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPACollectionSet");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin();  
        
        
        Address a1=new Address();
        a1.setE_pincode(1234);
        a1.setE_city("noida");
        a1.setE_state("UP");
        
        Address a2=new Address();
        a2.setE_pincode(12356);
        a2.setE_city("Jaipur");
        a2.setE_state("kkkk");
        

        Employee e1=new Employee();
        e1.setE_id(1);
        e1.setE_name("azar");
        
        Employee e2=new Employee();
        e2.setE_id(2);
        e2.setE_name("raja");
        
        e1.getAddress().add(a1);
        
        e2.getAddress().add(a2);
        
        em.persist(e1);
        
        em.persist(e2);
        
        em.getTransaction().commit();
        
        em.close();
        
        emf.close();
	}

}
