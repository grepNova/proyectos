package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class MediaMedia.
 * @see com.generado.MediaMedia
 * @author Hibernate Tools
 */
@Stateless
public class MediaMediaHome {

	private static final Log log = LogFactory.getLog(MediaMediaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MediaMedia transientInstance) {
		log.debug("persisting MediaMedia instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MediaMedia persistentInstance) {
		log.debug("removing MediaMedia instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MediaMedia merge(MediaMedia detachedInstance) {
		log.debug("merging MediaMedia instance");
		try {
			MediaMedia result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MediaMedia findById(int id) {
		log.debug("getting MediaMedia instance with id: " + id);
		try {
			MediaMedia instance = entityManager.find(MediaMedia.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
