package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class MediaGalleryMedia.
 * @see com.generado.MediaGalleryMedia
 * @author Hibernate Tools
 */
@Stateless
public class MediaGalleryMediaHome {

	private static final Log log = LogFactory
			.getLog(MediaGalleryMediaHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(MediaGalleryMedia transientInstance) {
		log.debug("persisting MediaGalleryMedia instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(MediaGalleryMedia persistentInstance) {
		log.debug("removing MediaGalleryMedia instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public MediaGalleryMedia merge(MediaGalleryMedia detachedInstance) {
		log.debug("merging MediaGalleryMedia instance");
		try {
			MediaGalleryMedia result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public MediaGalleryMedia findById(int id) {
		log.debug("getting MediaGalleryMedia instance with id: " + id);
		try {
			MediaGalleryMedia instance = entityManager.find(
					MediaGalleryMedia.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
