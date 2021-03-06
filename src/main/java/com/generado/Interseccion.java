package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Interseccion generated by hbm2java
 */
@Entity
@Table(name = "interseccion")
public class Interseccion implements java.io.Serializable {

	private int id;
	private Calle calleByCalleprin;
	private Calle calleByCallesec;
	private Double latitud;
	private Double longitud;
	private Set<Direccion> direccions = new HashSet<Direccion>(0);
	private Set<Monitoreo> monitoreos = new HashSet<Monitoreo>(0);
	private Set<Despacho> despachos = new HashSet<Despacho>(0);

	public Interseccion() {
	}

	public Interseccion(int id) {
		this.id = id;
	}

	public Interseccion(int id, Calle calleByCalleprin, Calle calleByCallesec,
			Double latitud, Double longitud, Set<Direccion> direccions,
			Set<Monitoreo> monitoreos, Set<Despacho> despachos) {
		this.id = id;
		this.calleByCalleprin = calleByCalleprin;
		this.calleByCallesec = calleByCallesec;
		this.latitud = latitud;
		this.longitud = longitud;
		this.direccions = direccions;
		this.monitoreos = monitoreos;
		this.despachos = despachos;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "calleprin")
	public Calle getCalleByCalleprin() {
		return this.calleByCalleprin;
	}

	public void setCalleByCalleprin(Calle calleByCalleprin) {
		this.calleByCalleprin = calleByCalleprin;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "callesec")
	public Calle getCalleByCallesec() {
		return this.calleByCallesec;
	}

	public void setCalleByCallesec(Calle calleByCallesec) {
		this.calleByCallesec = calleByCallesec;
	}

	@Column(name = "latitud", precision = 17, scale = 17)
	public Double getLatitud() {
		return this.latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	@Column(name = "longitud", precision = 17, scale = 17)
	public Double getLongitud() {
		return this.longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interseccion")
	public Set<Direccion> getDireccions() {
		return this.direccions;
	}

	public void setDireccions(Set<Direccion> direccions) {
		this.direccions = direccions;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "callemonitoreo", joinColumns = { @JoinColumn(name = "interseccion_id", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "monitoreo_id", nullable = false, updatable = false) })
	public Set<Monitoreo> getMonitoreos() {
		return this.monitoreos;
	}

	public void setMonitoreos(Set<Monitoreo> monitoreos) {
		this.monitoreos = monitoreos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "interseccion")
	public Set<Despacho> getDespachos() {
		return this.despachos;
	}

	public void setDespachos(Set<Despacho> despachos) {
		this.despachos = despachos;
	}

}
