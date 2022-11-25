package com.lojavirtuall;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    private static EntityManagerFactory entityManagerFactory = Persistence.
    createEntityManagerFactory("JPA");

    
	/** 
     * @return EntityManagerFactory
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
