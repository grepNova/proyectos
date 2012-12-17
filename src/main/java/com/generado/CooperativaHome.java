package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Cooperativa.
 * @see com.generado.Cooperativa
 * @author Hibernate Tools
 */
@Stateless
public class CooperativaHome {

	private static final Log log = LogFactory.getLog(CooperativaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Cooperativa transientInstance) {
		log.debug("persisting Cooperativa instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Cooperativa persistentInstance) {
		log.debug("removing Cooperativa instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Cooperativa merge(Cooperativa detachedInstance) {
		log.debug("merging Cooperativa instance");
		try {
			Cooperativa result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cooperativa findById(int id) {
		log.debug("getting Cooperativa instance with id: " + id);
		try {
			Cooperativa instance = entityManager.find(Cooperativa.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
