package com.lojavirtual;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//import net.miginfocom.swing.MigLayout;

/*
 * Está e classe principal que sera chamada para iniciar a aplicação
 */
public class App {
    private static EntityManagerFactory entityManagerFactory = Persistence.
    createEntityManagerFactory("WassabiApp");
    
	/** 
     * @return EntityManagerFactory
     */
    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}