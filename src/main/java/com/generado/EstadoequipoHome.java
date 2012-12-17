package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Estadoequipo.
 * @see com.generado.Estadoequipo
 * @author Hibernate Tools
 */
@Stateless
public class EstadoequipoHome {

	private static final Log log = LogFactory.getLog(EstadoequipoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Estadoequipo transientInstance) {
		log.debug("persisting Estadoequipo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Estadoequipo persistentInstance) {
		log.debug("removing Estadoequipo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Estadoequipo merge(Estadoequipo detachedInstance) {
		log.debug("merging Estadoequipo instance");
		try {
			Estadoequipo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Estadoequipo findById(String id) {
		log.debug("getting Estadoequipo instance with id: " + id);
		try {
			Estadoequipo instance = entityManager.find(Estadoequipo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
