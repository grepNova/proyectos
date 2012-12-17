package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class ExtLogEntries.
 * @see com.generado.ExtLogEntries
 * @author Hibernate Tools
 */
@Stateless
public class ExtLogEntriesHome {

	private static final Log log = LogFactory.getLog(ExtLogEntriesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ExtLogEntries transientInstance) {
		log.debug("persisting ExtLogEntries instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ExtLogEntries persistentInstance) {
		log.debug("removing ExtLogEntries instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ExtLogEntries merge(ExtLogEntries detachedInstance) {
		log.debug("merging ExtLogEntries instance");
		try {
			ExtLogEntries result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ExtLogEntries findById(int id) {
		log.debug("getting ExtLogEntries instance with id: " + id);
		try {
			ExtLogEntries instance = entityManager
					.find(ExtLogEntries.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
