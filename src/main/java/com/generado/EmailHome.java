package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Email.
 * @see com.generado.Email
 * @author Hibernate Tools
 */
@Stateless
public class EmailHome {

	private static final Log log = LogFactory.getLog(EmailHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Email transientInstance) {
		log.debug("persisting Email instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Email persistentInstance) {
		log.debug("removing Email instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Email merge(Email detachedInstance) {
		log.debug("merging Email instance");
		try {
			Email result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Email findById(int id) {
		log.debug("getting Email instance with id: " + id);
		try {
			Email instance = entityManager.find(Email.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
