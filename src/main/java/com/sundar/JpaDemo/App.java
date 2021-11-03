package com.sundar.JpaDemo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Student obj=new Student();
    	obj.setName("Lekha");
    	obj.setRollno(10);
    	obj.setMarks(95);
    	
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
    	EntityManager em=emf.createEntityManager();
        em.getTransaction().begin();
    
    	em.persist(em);
    	em.getTransaction().commit();		
    	em.close();
    	emf.close();
        
    }
}
