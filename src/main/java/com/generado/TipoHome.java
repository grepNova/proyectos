package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tipo.
 * @see com.generado.Tipo
 * @author Hibernate Tools
 */
@Stateless
public class TipoHome {

	private static final Log log = LogFactory.getLog(TipoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tipo transientInstance) {
		log.debug("persisting Tipo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tipo persistentInstance) {
		log.debug("removing Tipo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tipo merge(Tipo detachedInstance) {
		log.debug("merging Tipo instance");
		try {
			Tipo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tipo findById(int id) {
		log.debug("getting Tipo instance with id: " + id);
		try {
			Tipo instance = entityManager.find(Tipo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
