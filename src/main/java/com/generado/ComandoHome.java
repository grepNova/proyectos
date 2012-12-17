package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Comando.
 * @see com.generado.Comando
 * @author Hibernate Tools
 */
@Stateless
public class ComandoHome {

	private static final Log log = LogFactory.getLog(ComandoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Comando transientInstance) {
		log.debug("persisting Comando instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Comando persistentInstance) {
		log.debug("removing Comando instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Comando merge(Comando detachedInstance) {
		log.debug("merging Comando instance");
		try {
			Comando result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Comando findById(int id) {
		log.debug("getting Comando instance with id: " + id);
		try {
			Comando instance = entityManager.find(Comando.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
