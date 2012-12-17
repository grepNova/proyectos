package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FosUser.
 * @see com.generado.FosUser
 * @author Hibernate Tools
 */
@Stateless
public class FosUserHome {

	private static final Log log = LogFactory.getLog(FosUserHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FosUser transientInstance) {
		log.debug("persisting FosUser instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FosUser persistentInstance) {
		log.debug("removing FosUser instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FosUser merge(FosUser detachedInstance) {
		log.debug("merging FosUser instance");
		try {
			FosUser result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FosUser findById(int id) {
		log.debug("getting FosUser instance with id: " + id);
		try {
			FosUser instance = entityManager.find(FosUser.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
