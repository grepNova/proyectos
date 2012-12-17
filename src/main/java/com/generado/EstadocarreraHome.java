package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Estadocarrera.
 * @see com.generado.Estadocarrera
 * @author Hibernate Tools
 */
@Stateless
public class EstadocarreraHome {

	private static final Log log = LogFactory.getLog(EstadocarreraHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Estadocarrera transientInstance) {
		log.debug("persisting Estadocarrera instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Estadocarrera persistentInstance) {
		log.debug("removing Estadocarrera instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Estadocarrera merge(Estadocarrera detachedInstance) {
		log.debug("merging Estadocarrera instance");
		try {
			Estadocarrera result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Estadocarrera findById(String id) {
		log.debug("getting Estadocarrera instance with id: " + id);
		try {
			Estadocarrera instance = entityManager
					.find(Estadocarrera.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
