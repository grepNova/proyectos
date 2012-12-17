package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class MediaGallery.
 * @see com.generado.MediaGallery
 * @author Hibernate Tools
 */
@Stateless
public class MediaGalleryHome {

	private static final Log log = LogFactory.getLog(MediaGalleryHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MediaGallery transientInstance) {
		log.debug("persisting MediaGallery instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MediaGallery persistentInstance) {
		log.debug("removing MediaGallery instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MediaGallery merge(MediaGallery detachedInstance) {
		log.debug("merging MediaGallery instance");
		try {
			MediaGallery result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MediaGallery findById(int id) {
		log.debug("getting MediaGallery instance with id: " + id);
		try {
			MediaGallery instance = entityManager.find(MediaGallery.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
