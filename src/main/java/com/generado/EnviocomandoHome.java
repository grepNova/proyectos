package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Enviocomando.
 * @see com.generado.Enviocomando
 * @author Hibernate Tools
 */
@Stateless
public class EnviocomandoHome {

	private static final Log log = LogFactory.getLog(EnviocomandoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Enviocomando transientInstance) {
		log.debug("persisting Enviocomando instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Enviocomando persistentInstance) {
		log.debug("removing Enviocomando instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Enviocomando merge(Enviocomando detachedInstance) {
		log.debug("merging Enviocomando instance");
		try {
			Enviocomando result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Enviocomando findById(int id) {
		log.debug("getting Enviocomando instance with id: " + id);
		try {
			Enviocomando instance = entityManager.find(Enviocomando.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
