package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Institucion.
 * @see com.generado.Institucion
 * @author Hibernate Tools
 */
@Stateless
public class InstitucionHome {

	private static final Log log = LogFactory.getLog(InstitucionHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Institucion transientInstance) {
		log.debug("persisting Institucion instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Institucion persistentInstance) {
		log.debug("removing Institucion instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Institucion merge(Institucion detachedInstance) {
		log.debug("merging Institucion instance");
		try {
			Institucion result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Institucion findById(int id) {
		log.debug("getting Institucion instance with id: " + id);
		try {
			Institucion instance = entityManager.find(Institucion.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
