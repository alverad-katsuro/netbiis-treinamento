package com.curso4.unidade4.teste;
// Generated 3 de nov. de 2022 00:20:59 by Hibernate Tools 5.6.12.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

/**
 * Home object for domain model class ClienteHasCurso.
 * @see com.curso4.unidade4.teste.ClienteHasCurso
 * @author Hibernate Tools
 */
public class ClienteHasCursoHome {

	private static final Logger logger = Logger.getLogger(ClienteHasCursoHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(ClienteHasCurso transientInstance) {
		logger.log(Level.INFO, "persisting ClienteHasCurso instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(ClienteHasCurso instance) {
		logger.log(Level.INFO, "attaching dirty ClienteHasCurso instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(ClienteHasCurso instance) {
		logger.log(Level.INFO, "attaching clean ClienteHasCurso instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(ClienteHasCurso persistentInstance) {
		logger.log(Level.INFO, "deleting ClienteHasCurso instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public ClienteHasCurso merge(ClienteHasCurso detachedInstance) {
		logger.log(Level.INFO, "merging ClienteHasCurso instance");
		try {
			ClienteHasCurso result = (ClienteHasCurso) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public ClienteHasCurso findById(com.curso4.unidade4.teste.ClienteHasCursoId id) {
		logger.log(Level.INFO, "getting ClienteHasCurso instance with id: " + id);
		try {
			ClienteHasCurso instance = (ClienteHasCurso) sessionFactory.getCurrentSession()
					.get("com.curso4.unidade4.teste.ClienteHasCurso", id);
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

	public List findByExample(ClienteHasCurso instance) {
		logger.log(Level.INFO, "finding ClienteHasCurso instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("com.curso4.unidade4.teste.ClienteHasCurso").add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
