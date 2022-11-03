package com.curso4.unidade4.bd;
// Generated 3 de nov. de 2022 00:20:59 by Hibernate Tools 5.6.12.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.curso4.unidade4.model.ClienteHasCurso;
import com.curso4.unidade4.model.ClienteHasCursoId;

/**
 * Home object for domain model class ClienteHasCurso.
 * @see com.curso4.unidade4.model.ClienteHasCurso
 * @author Hibernate Tools
 */
public class ClienteHasCursoDAO {

	private static final Logger logger = Logger.getLogger(ClienteHasCursoDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return HibernateSessionFactory.getSessionFactory();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ClienteHasCurso transientInstance) {
		logger.log(Level.INFO, "persisting ClienteHasCurso instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();

			session.persist(transientInstance);

            tx.commit();
			session.close();
            
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void delete(ClienteHasCurso persistentInstance) {
		logger.log(Level.INFO, "deleting ClienteHasCurso instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();

			session.delete(persistentInstance);

            tx.commit();
			session.close();

			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public ClienteHasCurso merge(ClienteHasCurso detachedInstance) {
		logger.log(Level.INFO, "merging ClienteHasCurso instance");
		try {
            Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();

			ClienteHasCurso result = (ClienteHasCurso) session.merge(detachedInstance);

            tx.commit();
			session.close();

			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public ClienteHasCurso findById(ClienteHasCursoId id) {
		logger.log(Level.INFO, "getting ClienteHasCurso instance with id: " + id);
		try {
            Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();

			ClienteHasCurso instance = (ClienteHasCurso) session.get("com.curso4.unidade4.model.ClienteHasCurso", id);

            tx.commit();
			session.close();

			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

    @SuppressWarnings("unchecked")
    public List<ClienteHasCurso> findAll() {

		System.out.println("finding all Curso instances");
		try {
            Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			String queryString = "from Curso";
			Query queryObject = session.createQuery(queryString);
			List<ClienteHasCurso> clientes = queryObject.getResultList();
            
            session.close();
			return clientes;
		} catch (RuntimeException re) {
			System.err.println("find all failed "+ re);
			throw re;
		}
	}
}
