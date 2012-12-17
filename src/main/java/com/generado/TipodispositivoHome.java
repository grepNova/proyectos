package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Tipodispositivo.
 * @see com.generado.Tipodispositivo
 * @author Hibernate Tools
 */
@Stateless
public class TipodispositivoHome {

	private static final Log log = LogFactory.getLog(TipodispositivoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Tipodispositivo transientInstance) {
		log.debug("persisting Tipodispositivo instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Tipodispositivo persistentInstance) {
		log.debug("removing Tipodispositivo instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Tipodispositivo merge(Tipodispositivo detachedInstance) {
		log.debug("merging Tipodispositivo instance");
		try {
			Tipodispositivo result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tipodispositivo findById(int id) {
		log.debug("getting Tipodispositivo instance with id: " + id);
		try {
			Tipodispositivo instance = entityManager.find(
					Tipodispositivo.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
