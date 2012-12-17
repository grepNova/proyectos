package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Telefono.
 * @see com.generado.Telefono
 * @author Hibernate Tools
 */
@Stateless
public class TelefonoHome {

	private static final Log log = LogFactory.getLog(TelefonoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Telefono transientInstance) {
		log.debug("persisting Telefono instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Telefono persistentInstance) {
		log.debug("removing Telefono instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Telefono merge(Telefono detachedInstance) {
		log.debug("merging Telefono instance");
		try {
			Telefono result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Telefono findById(int id) {
		log.debug("getting Telefono instance with id: " + id);
		try {
			Telefono instance = entityManager.find(Telefono.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
