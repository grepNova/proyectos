package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Interseccion.
 * @see com.generado.Interseccion
 * @author Hibernate Tools
 */
@Stateless
public class InterseccionHome {

	private static final Log log = LogFactory.getLog(InterseccionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Interseccion transientInstance) {
		log.debug("persisting Interseccion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Interseccion persistentInstance) {
		log.debug("removing Interseccion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Interseccion merge(Interseccion detachedInstance) {
		log.debug("merging Interseccion instance");
		try {
			Interseccion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Interseccion findById(int id) {
		log.debug("getting Interseccion instance with id: " + id);
		try {
			Interseccion instance = entityManager.find(Interseccion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
