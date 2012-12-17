package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Propietario.
 * @see com.generado.Propietario
 * @author Hibernate Tools
 */
@Stateless
public class PropietarioHome {

	private static final Log log = LogFactory.getLog(PropietarioHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Propietario transientInstance) {
		log.debug("persisting Propietario instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Propietario persistentInstance) {
		log.debug("removing Propietario instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Propietario merge(Propietario detachedInstance) {
		log.debug("merging Propietario instance");
		try {
			Propietario result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Propietario findById(int id) {
		log.debug("getting Propietario instance with id: " + id);
		try {
			Propietario instance = entityManager.find(Propietario.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
