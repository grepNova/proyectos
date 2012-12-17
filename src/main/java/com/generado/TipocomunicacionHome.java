package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tipocomunicacion.
 * @see com.generado.Tipocomunicacion
 * @author Hibernate Tools
 */
@Stateless
public class TipocomunicacionHome {

	private static final Log log = LogFactory
			.getLog(TipocomunicacionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tipocomunicacion transientInstance) {
		log.debug("persisting Tipocomunicacion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tipocomunicacion persistentInstance) {
		log.debug("removing Tipocomunicacion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tipocomunicacion merge(Tipocomunicacion detachedInstance) {
		log.debug("merging Tipocomunicacion instance");
		try {
			Tipocomunicacion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tipocomunicacion findById(int id) {
		log.debug("getting Tipocomunicacion instance with id: " + id);
		try {
			Tipocomunicacion instance = entityManager.find(
					Tipocomunicacion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
