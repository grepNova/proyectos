package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Mensajes.
 * @see com.generado.Mensajes
 * @author Hibernate Tools
 */
@Stateless
public class MensajesHome {

	private static final Log log = LogFactory.getLog(MensajesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Mensajes transientInstance) {
		log.debug("persisting Mensajes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Mensajes persistentInstance) {
		log.debug("removing Mensajes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Mensajes merge(Mensajes detachedInstance) {
		log.debug("merging Mensajes instance");
		try {
			Mensajes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Mensajes findById(int id) {
		log.debug("getting Mensajes instance with id: " + id);
		try {
			Mensajes instance = entityManager.find(Mensajes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
