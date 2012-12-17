package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ExtTranslations.
 * @see com.generado.ExtTranslations
 * @author Hibernate Tools
 */
@Stateless
public class ExtTranslationsHome {

	private static final Log log = LogFactory.getLog(ExtTranslationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ExtTranslations transientInstance) {
		log.debug("persisting ExtTranslations instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ExtTranslations persistentInstance) {
		log.debug("removing ExtTranslations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ExtTranslations merge(ExtTranslations detachedInstance) {
		log.debug("merging ExtTranslations instance");
		try {
			ExtTranslations result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExtTranslations findById(int id) {
		log.debug("getting ExtTranslations instance with id: " + id);
		try {
			ExtTranslations instance = entityManager.find(
					ExtTranslations.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
