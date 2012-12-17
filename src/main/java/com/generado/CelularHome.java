package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Celular.
 * @see com.generado.Celular
 * @author Hibernate Tools
 */
@Stateless
public class CelularHome {

	private static final Log log = LogFactory.getLog(CelularHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Celular transientInstance) {
		log.debug("persisting Celular instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Celular persistentInstance) {
		log.debug("removing Celular instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Celular merge(Celular detachedInstance) {
		log.debug("merging Celular instance");
		try {
			Celular result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Celular findById(int id) {
		log.debug("getting Celular instance with id: " + id);
		try {
			Celular instance = entityManager.find(Celular.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
