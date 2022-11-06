package com.curso4.unidade4.bd;
// Generated 3 de nov. de 2022 00:20:59 by Hibernate Tools 5.6.12.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.curso4.unidade4.model.Curso;

/**
 * Home object for domain model class Curso.
 * @see com.curso4.unidade4.model.Curso
 * @author Hibernate Tools
 */
public class CursoDAO {

	private static final Logger logger = Logger.getLogger(CursoDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return HibernateSessionFactory.getSessionFactory();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Curso transientInstance) {
		logger.log(Level.INFO, "persisting Curso instance");
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

	public void delete(Curso persistentInstance) {
		logger.log(Level.INFO, "deleting Curso instance");
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

	public Curso merge(Curso detachedInstance) {
		logger.log(Level.INFO, "merging Curso instance");
		try {
            Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();

			Curso result = (Curso) session.merge(detachedInstance);

            tx.commit();
			session.close();
            
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public Curso findById(java.lang.Integer id) {
		logger.log(Level.INFO, "getting Curso instance with id: " + id);
		try {
            Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();

			Curso instance = (Curso) session.get(Curso.class, id);

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
    public List<Curso> findAll() {

		System.out.println("finding all Curso instances");
		try {
            Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			String queryString = "from Curso";
			Query queryObject = session.createQuery(queryString);
			List<Curso> cursos = queryObject.getResultList();
            
            session.close();
			return cursos;
		} catch (RuntimeException re) {
			System.err.println("find all failed "+ re);
			throw re;
		}
	}

}
