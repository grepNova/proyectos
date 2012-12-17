package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Recorrido.
 * @see com.generado.Recorrido
 * @author Hibernate Tools
 */
@Stateless
public class RecorridoHome {

	private static final Log log = LogFactory.getLog(RecorridoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Recorrido transientInstance) {
		log.debug("persisting Recorrido instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Recorrido persistentInstance) {
		log.debug("removing Recorrido instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Recorrido merge(Recorrido detachedInstance) {
		log.debug("merging Recorrido instance");
		try {
			Recorrido result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Recorrido findById(int id) {
		log.debug("getting Recorrido instance with id: " + id);
		try {
			Recorrido instance = entityManager.find(Recorrido.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
