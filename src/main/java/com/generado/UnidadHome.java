package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Unidad.
 * @see com.generado.Unidad
 * @author Hibernate Tools
 */
@Stateless
public class UnidadHome {

	private static final Log log = LogFactory.getLog(UnidadHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Unidad transientInstance) {
		log.debug("persisting Unidad instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Unidad persistentInstance) {
		log.debug("removing Unidad instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Unidad merge(Unidad detachedInstance) {
		log.debug("merging Unidad instance");
		try {
			Unidad result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Unidad findById(int id) {
		log.debug("getting Unidad instance with id: " + id);
		try {
			Unidad instance = entityManager.find(Unidad.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
