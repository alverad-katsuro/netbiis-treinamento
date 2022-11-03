package com.curso4.unidade4.bd;
// Generated 31 de out. de 2022 12:02:22 by Hibernate Tools 4.3.6.Final

import java.util.List;

import javax.persistence.Query;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.curso4.unidade4.model.Cliente;

/**
 * Home object for domain model class Cliente.
 * @see com.netbiis.Cliente
 * @author Hibernate Tools
 */
public class ClienteHome {

    public static void main(String[] args) {
        Cliente cliente2 = new Cliente("Alfredo2", "Gabriel", "amgabriel1@hotmail.com", "(91) 984487808", "000.000.000-00");
        ClienteHome clientedao = new ClienteHome();
        clientedao.persist(cliente2);
    }

	private static final Log log = LogFactory.getLog(ClienteHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return HibernateSessionFactory.getSessionFactory();
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}
	
	public Session getSession() {
		return HibernateSessionFactory.getSession();  
	}

	public void persist(Cliente transientInstance) {
		
		System.out.println("persisting Cliente instance");
		try {
			
			Session session = sessionFactory.getCurrentSession();

			Transaction tx = session.beginTransaction();
			session.save(transientInstance);
			tx.commit();
			session.close();
			
			System.out.println("persist successful");
		} catch (RuntimeException re) {
			System.err.println("persist failed "+re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Cliente> findAll() {

		System.out.println("finding all Cliente instances");
		try {
			String queryString = "from Cliente";
			Query queryObject = getSession().createQuery(queryString);
			List<Cliente> clientes = queryObject.getResultList();
			return clientes;
		} catch (RuntimeException re) {
			System.err.println("find all failed "+ re);
			throw re;
		}
	}


	public void delete(Cliente persistentInstance) {
		System.out.println("deleting Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();

			Transaction tx = session.beginTransaction();
			session.delete(persistentInstance);
			tx.commit();
			session.close();
			
			System.out.println("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public void merge(Cliente detachedInstance) {
		System.out.println("merging Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();

			Transaction tx = session.beginTransaction();
			session.update(detachedInstance);
			tx.commit();
			session.close();
			System.out.println("merge successful");
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	
}
