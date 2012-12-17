package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Estadoservicio.
 * @see com.generado.Estadoservicio
 * @author Hibernate Tools
 */
@Stateless
public class EstadoservicioHome {

	private static final Log log = LogFactory.getLog(EstadoservicioHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Estadoservicio transientInstance) {
		log.debug("persisting Estadoservicio instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Estadoservicio persistentInstance) {
		log.debug("removing Estadoservicio instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Estadoservicio merge(Estadoservicio detachedInstance) {
		log.debug("merging Estadoservicio instance");
		try {
			Estadoservicio result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Estadoservicio findById(String id) {
		log.debug("getting Estadoservicio instance with id: " + id);
		try {
			Estadoservicio instance = entityManager.find(Estadoservicio.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
