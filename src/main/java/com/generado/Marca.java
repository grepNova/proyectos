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
 * Marca generated by hbm2java
 */
@Entity
@Table(name = "marca")
public class Marca implements java.io.Serializable {

	private int idmarca;
	private String nombre;
	private Set<Unidad> unidads = new HashSet<Unidad>(0);

	public Marca() {
	}

	public Marca(int idmarca) {
		this.idmarca = idmarca;
	}

	public Marca(int idmarca, String nombre, Set<Unidad> unidads) {
		this.idmarca = idmarca;
		this.nombre = nombre;
		this.unidads = unidads;
	}

	@Id
	@Column(name = "idmarca", unique = true, nullable = false)
	public int getIdmarca() {
		return this.idmarca;
	}

	public void setIdmarca(int idmarca) {
		this.idmarca = idmarca;
	}

	@Column(name = "nombre", length = 100)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "marca")
	public Set<Unidad> getUnidads() {
		return this.unidads;
	}

	public void setUnidads(Set<Unidad> unidads) {
		this.unidads = unidads;
	}

}
