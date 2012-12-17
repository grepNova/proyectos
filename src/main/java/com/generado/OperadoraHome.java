package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Operadora.
 * @see com.generado.Operadora
 * @author Hibernate Tools
 */
@Stateless
public class OperadoraHome {

	private static final Log log = LogFactory.getLog(OperadoraHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Operadora transientInstance) {
		log.debug("persisting Operadora instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Operadora persistentInstance) {
		log.debug("removing Operadora instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Operadora merge(Operadora detachedInstance) {
		log.debug("merging Operadora instance");
		try {
			Operadora result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Operadora findById(int id) {
		log.debug("getting Operadora instance with id: " + id);
		try {
			Operadora instance = entityManager.find(Operadora.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
