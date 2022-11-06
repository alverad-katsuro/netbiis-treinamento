package com.curso4.unidade4.bd;
// Generated 3 de nov. de 2022 00:20:59 by Hibernate Tools 5.6.12.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.curso4.unidade4.model.Cliente;

/**
 * Home object for domain model class Cliente.
 * @see com.curso4.unidade4.model.Cliente
 * @author Hibernate Tools
 */
public class ClienteDAO {

	private static final Logger logger = Logger.getLogger(ClienteDAO.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return HibernateSessionFactory.getSessionFactory();
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Cliente transientInstance) {
		logger.log(Level.INFO, "persisting Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();

			session.save(transientInstance);

			tx.commit();
			session.close();
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void delete(Cliente persistentInstance) {
		logger.log(Level.INFO, "deleting Cliente instance");
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

	public Cliente merge(Cliente detachedInstance) {
		logger.log(Level.INFO, "merging Cliente instance");
		try {
            Session session = sessionFactory.getCurrentSession();

			Transaction tx = session.beginTransaction();
			//session.update(detachedInstance);
			Cliente result = (Cliente) session.merge(detachedInstance);
			tx.commit();
			session.close();
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public Cliente findById(int id) {
		logger.log(Level.INFO, "getting Cliente instance with id: " + id);
		try {
            Session session = sessionFactory.getCurrentSession();
			Transaction tx = session.beginTransaction();

			Cliente instance = (Cliente) session.get(Cliente.class, id);
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
    public List<Cliente> findAll() {

		System.out.println("finding all Cliente instances");
		try {
            Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();

			String queryString = "from Cliente";
			Query<Cliente> queryObject = session.createQuery(queryString);
			List<Cliente> clientes = queryObject.getResultList();
            
            session.close();
			return clientes;
		} catch (RuntimeException re) {
			System.err.println("find all failed "+ re);
			throw re;
		}
	}

    /*
     * 
     public List findByExample(Cliente instance) {
         logger.log(Level.INFO, "finding Cliente instance by example");
         try {
             List results = sessionFactory.getCurrentSession().createCriteria("com.curso4.unidade4.model.Cliente")
             .add(Example.create(instance)).list();
             logger.log(Level.INFO, "find by example successful, result size: " + results.size());
             return results;
            } catch (RuntimeException re) {
                logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
    */
}
