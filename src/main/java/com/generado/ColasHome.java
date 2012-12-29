package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.type.AnyType;

import com.view.UltimoregistroVista;


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
	public List<UltimoregistroVista> getIdUni() {
		
		//new UltimoregistroVista(
//		idmonitoreo, idunidad, 
//		codigounidad, fechahora, 
//		latitud, longitud, 
//		direccionip, velocidad, 
//		calleprin, callesec, 
//		provincia, ciudad, 
//		tipotrama, 
//		estadoequipo)
		
		List<UltimoregistroVista> sal =
		
		entityManager.
				createQuery("SELECT New com.view.UltimoregistroVista(m.idmonitoreo, uni.idunidad, m.codigounidad, m.fecharegistro, m.latitud, m.longitud, m.direccionip, m.velocidad, cprin.nombre, csec.nombre, prv.nombre, ciu.nombre, tptr.descripcion, esteq.descripcion) FROM Monitoreo m inner join m.unidad as uni inner join m.tipotrama as tptr inner join m.estadoequipo as esteq inner join m.ultimoregistros as ur left outer join m.interseccions as itr left join itr.calleByCalleprin as cprin left join itr.calleByCallesec as csec left join csec.ciudad as ciu left join ciu.provincia as prv where esteq.codigo = 1 ").getResultList();
		
		return sal;
		
	}
	
	@SuppressWarnings("unchecked")
	public List<Object[]> getMonitoreo() {
		
		List salida = null;
		
		try {
			salida = entityManager.
					createQuery("" +
			
					"SELECT uni.idunidad, m.codigounidad as cod, m.fechahora, m.velocidad, m.direccionip, cprin.nombre, csec.nombre, ciu.nombre, prv.nombre, m.latitud as lat, m.longitud as lon  FROM Monitoreo m inner join m.unidad as uni inner join m.ultimoregistros as ur left outer join m.interseccions as itr left join itr.calleByCalleprin as cprin left join itr.calleByCallesec as csec left join csec.ciudad as ciu left join ciu.provincia as prv" +
					
						"").getResultList();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return salida;
		
	}
}
