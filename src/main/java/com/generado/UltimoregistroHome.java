package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Ultimoregistro.
 * @see com.generado.Ultimoregistro
 * @author Hibernate Tools
 */
@Stateless
public class UltimoregistroHome {

	private static final Log log = LogFactory.getLog(UltimoregistroHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Ultimoregistro transientInstance) {
		log.debug("persisting Ultimoregistro instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Ultimoregistro persistentInstance) {
		log.debug("removing Ultimoregistro instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Ultimoregistro merge(Ultimoregistro detachedInstance) {
		log.debug("merging Ultimoregistro instance");
		try {
			Ultimoregistro result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Ultimoregistro findById(int id) {
		log.debug("getting Ultimoregistro instance with id: " + id);
		try {
			Ultimoregistro instance = entityManager.find(Ultimoregistro.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
