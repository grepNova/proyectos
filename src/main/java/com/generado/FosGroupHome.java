package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class FosGroup.
 * @see com.generado.FosGroup
 * @author Hibernate Tools
 */
@Stateless
public class FosGroupHome {

	private static final Log log = LogFactory.getLog(FosGroupHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(FosGroup transientInstance) {
		log.debug("persisting FosGroup instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(FosGroup persistentInstance) {
		log.debug("removing FosGroup instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public FosGroup merge(FosGroup detachedInstance) {
		log.debug("merging FosGroup instance");
		try {
			FosGroup result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public FosGroup findById(int id) {
		log.debug("getting FosGroup instance with id: " + id);
		try {
			FosGroup instance = entityManager.find(FosGroup.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
