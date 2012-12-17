package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Unidadtraspaso.
 * @see com.generado.Unidadtraspaso
 * @author Hibernate Tools
 */
@Stateless
public class UnidadtraspasoHome {

	private static final Log log = LogFactory.getLog(UnidadtraspasoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Unidadtraspaso transientInstance) {
		log.debug("persisting Unidadtraspaso instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Unidadtraspaso persistentInstance) {
		log.debug("removing Unidadtraspaso instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Unidadtraspaso merge(Unidadtraspaso detachedInstance) {
		log.debug("merging Unidadtraspaso instance");
		try {
			Unidadtraspaso result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Unidadtraspaso findById(int id) {
		log.debug("getting Unidadtraspaso instance with id: " + id);
		try {
			Unidadtraspaso instance = entityManager.find(Unidadtraspaso.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
