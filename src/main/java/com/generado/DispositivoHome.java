package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Dispositivo.
 * @see com.generado.Dispositivo
 * @author Hibernate Tools
 */
@Stateless
public class DispositivoHome {

	private static final Log log = LogFactory.getLog(DispositivoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Dispositivo transientInstance) {
		log.debug("persisting Dispositivo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Dispositivo persistentInstance) {
		log.debug("removing Dispositivo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Dispositivo merge(Dispositivo detachedInstance) {
		log.debug("merging Dispositivo instance");
		try {
			Dispositivo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Dispositivo findById(int id) {
		log.debug("getting Dispositivo instance with id: " + id);
		try {
			Dispositivo instance = entityManager.find(Dispositivo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
