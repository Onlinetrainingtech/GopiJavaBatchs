package com.xyz;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentCRUD {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAHibernatep1");  
        EntityManager em=emf.createEntityManager();  
          
        em.getTransaction().begin(); 
        
        /*StudentEntity s1=new StudentEntity();
        s1.setId(1001);
        s1.setName("azar");
        s1.setAge(24);
        
        em.persist(s1);*/

       
        
        /*StudentEntity s=em.find(StudentEntity.class,1001);
        System.out.println("StudentId"+s.getId());
        System.out.println("StudentName::"+s.getName());
        System.out.println("StudentAge::"+s.getAge());*/
        
        StudentEntity s=em.find(StudentEntity.class,1001);
        /*System.out.println("BeforeUpdation");
        System.out.println("StudentId"+s.getId());
        System.out.println("StudentName::"+s.getName());
        System.out.println("StudentAge::"+s.getAge());*/
        
        s.setAge(45);
        
        System.out.println("AfterUpdated");
        System.out.println("StudentId"+s.getId());
        System.out.println("StudentName::"+s.getName());
        System.out.println("StudentAge::"+s.getAge());
       
        
        em.getTransaction().commit();
        
        emf.close();
        
        em.close();
	}

}
