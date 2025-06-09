package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaEx {
	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("rita");
	
		EntityManager em = factory.createEntityManager();
		
		em.getTransaction().begin();
		
		System.out.println("It's working successfully");
		
		em.getTransaction().commit();
		
		em.close();
	}

}
