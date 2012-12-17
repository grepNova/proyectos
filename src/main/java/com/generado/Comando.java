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
 * Comando generated by hbm2java
 */
@Entity
@Table(name = "comando")
public class Comando implements java.io.Serializable {

	private int idcomando;
	private String codigo;
	private String descripcion;
	private String detalleComando;
	private Set<Enviocomando> enviocomandos = new HashSet<Enviocomando>(0);

	public Comando() {
	}

	public Comando(int idcomando) {
		this.idcomando = idcomando;
	}

	public Comando(int idcomando, String codigo, String descripcion,
			String detalleComando, Set<Enviocomando> enviocomandos) {
		this.idcomando = idcomando;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.detalleComando = detalleComando;
		this.enviocomandos = enviocomandos;
	}

	@Id
	@Column(name = "idcomando", unique = true, nullable = false)
	public int getIdcomando() {
		return this.idcomando;
	}

	public void setIdcomando(int idcomando) {
		this.idcomando = idcomando;
	}

	@Column(name = "codigo", length = 100)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Column(name = "descripcion", length = 100)
	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Column(name = "detalle_comando")
	public String getDetalleComando() {
		return this.detalleComando;
	}

	public void setDetalleComando(String detalleComando) {
		this.detalleComando = detalleComando;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "comando")
	public Set<Enviocomando> getEnviocomandos() {
		return this.enviocomandos;
	}

	public void setEnviocomandos(Set<Enviocomando> enviocomandos) {
		this.enviocomandos = enviocomandos;
	}

}
