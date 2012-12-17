package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * Home object for domain model class Colas.
 * @see com.generado.Colas
 * @author Hibernate Tools
 */
@Stateless
public class ColasHome {

	private static final Log log = LogFactory.getLog(ColasHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Colas transientInstance) {
		log.debug("persisting Colas instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Colas persistentInstance) {
		log.debug("removing Colas instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Colas merge(Colas detachedInstance) {
		log.debug("merging Colas instance");
		try {
			Colas result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Colas findById(int id) {
		log.debug("getting Colas instance with id: " + id);
		try {
			Colas instance = entityManager.find(Colas.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Colas> getAll() {
		return entityManager.
				createQuery("SELECT _perfiles FROM Colas _perfiles").getResultList();
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Colas> getImportant() {
		return entityManager.
				createQuery("SELECT c.nombre, c.telefono FROM Colas c").getResultList();
		
	}
}
