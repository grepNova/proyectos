package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Mecanica.
 * @see com.generado.Mecanica
 * @author Hibernate Tools
 */
@Stateless
public class MecanicaHome {

	private static final Log log = LogFactory.getLog(MecanicaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Mecanica transientInstance) {
		log.debug("persisting Mecanica instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Mecanica persistentInstance) {
		log.debug("removing Mecanica instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Mecanica merge(Mecanica detachedInstance) {
		log.debug("merging Mecanica instance");
		try {
			Mecanica result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Mecanica findById(String id) {
		log.debug("getting Mecanica instance with id: " + id);
		try {
			Mecanica instance = entityManager.find(Mecanica.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
