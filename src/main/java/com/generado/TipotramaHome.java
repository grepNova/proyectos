package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tipotrama.
 * @see com.generado.Tipotrama
 * @author Hibernate Tools
 */
@Stateless
public class TipotramaHome {

	private static final Log log = LogFactory.getLog(TipotramaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tipotrama transientInstance) {
		log.debug("persisting Tipotrama instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tipotrama persistentInstance) {
		log.debug("removing Tipotrama instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tipotrama merge(Tipotrama detachedInstance) {
		log.debug("merging Tipotrama instance");
		try {
			Tipotrama result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tipotrama findById(String id) {
		log.debug("getting Tipotrama instance with id: " + id);
		try {
			Tipotrama instance = entityManager.find(Tipotrama.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
