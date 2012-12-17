package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Monitoreo.
 * @see com.generado.Monitoreo
 * @author Hibernate Tools
 */
@Stateless
public class MonitoreoHome {

	private static final Log log = LogFactory.getLog(MonitoreoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Monitoreo transientInstance) {
		log.debug("persisting Monitoreo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Monitoreo persistentInstance) {
		log.debug("removing Monitoreo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Monitoreo merge(Monitoreo detachedInstance) {
		log.debug("merging Monitoreo instance");
		try {
			Monitoreo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Monitoreo findById(int id) {
		log.debug("getting Monitoreo instance with id: " + id);
		try {
			Monitoreo instance = entityManager.find(Monitoreo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
