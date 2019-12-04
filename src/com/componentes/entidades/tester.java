package com.componentes.entidades;

import javax.persistence.*;

public class tester {
	
	
	
	private static EntityManagerFactory entityManagerFactory = null;
	private static EntityManager em = null;

	public static void main(String[] args) {
	     try {
	            startEntityManagerFactory();
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	     stopEntityManagerFactory();
		
	}
    public static void startEntityManagerFactory() throws Exception {
		if (entityManagerFactory == null) {
			try {
				entityManagerFactory = Persistence
						.createEntityManagerFactory("Componentes");
				em = entityManagerFactory.createEntityManager();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
    
    public static void stopEntityManagerFactory() {
		if (entityManagerFactory != null) {
			if (entityManagerFactory.isOpen()) {
				try {
					entityManagerFactory.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			em.close();
			entityManagerFactory = null;
		}
	}
	
}
