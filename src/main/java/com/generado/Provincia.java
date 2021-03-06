package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Provincia generated by hbm2java
 */
@Entity
@Table(name = "provincia")
public class Provincia implements java.io.Serializable {

	private int idprovincia;
	private String nombre;
	private Set<Ciudad> ciudads = new HashSet<Ciudad>(0);

	public Provincia() {
	}

	public Provincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	public Provincia(int idprovincia, String nombre, Set<Ciudad> ciudads) {
		this.idprovincia = idprovincia;
		this.nombre = nombre;
		this.ciudads = ciudads;
	}

	@Id
	@Column(name = "idprovincia", unique = true, nullable = false)
	public int getIdprovincia() {
		return this.idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	@Column(name = "nombre", length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "provincia")
	public Set<Ciudad> getCiudads() {
		return this.ciudads;
	}

	public void setCiudads(Set<Ciudad> ciudads) {
		this.ciudads = ciudads;
	}

}
