package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Usuariotraspaso.
 * @see com.generado.Usuariotraspaso
 * @author Hibernate Tools
 */
@Stateless
public class UsuariotraspasoHome {

	private static final Log log = LogFactory.getLog(UsuariotraspasoHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Usuariotraspaso transientInstance) {
		log.debug("persisting Usuariotraspaso instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Usuariotraspaso persistentInstance) {
		log.debug("removing Usuariotraspaso instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Usuariotraspaso merge(Usuariotraspaso detachedInstance) {
		log.debug("merging Usuariotraspaso instance");
		try {
			Usuariotraspaso result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Usuariotraspaso findById(int id) {
		log.debug("getting Usuariotraspaso instance with id: " + id);
		try {
			Usuariotraspaso instance = entityManager.find(
					Usuariotraspaso.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
