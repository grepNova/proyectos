package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Ciudad.
 * @see com.generado.Ciudad
 * @author Hibernate Tools
 */
@Stateless
public class CiudadHome {

	private static final Log log = LogFactory.getLog(CiudadHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Ciudad transientInstance) {
		log.debug("persisting Ciudad instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ciudad persistentInstance) {
		log.debug("removing Ciudad instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ciudad merge(Ciudad detachedInstance) {
		log.debug("merging Ciudad instance");
		try {
			Ciudad result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ciudad findById(int id) {
		log.debug("getting Ciudad instance with id: " + id);
		try {
			Ciudad instance = entityManager.find(Ciudad.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
