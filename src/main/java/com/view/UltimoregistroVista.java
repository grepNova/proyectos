package com.view;

import java.util.Date;


public class UltimoregistroVista {
	
	private int idmonitoreo;
	private int idunidad;
	private int idcooperativa;
	private Integer codigounidad;
	private Date fechahora;
	private String latitud;
	private String longitud;
	private String direccionip;
	private Double velocidad;
	private Integer idptocontrol;
	private String estadoPuertas;
	private Double distInstalacion;
	private Double distRuta;
	private Date fecharegistro;
	private String rumbo;
	private String variacion;
	private Integer satelites;
	private Double odometro;
	
	private String calleprin;
	private String callesec;
	private String provincia;
	private String ciudad;

	private String tipotrama;
	private String estadoequipo;
	
	private String codMuni;
	
	private String alias;
	
	public UltimoregistroVista(int idunidad) {
		this.idunidad = idunidad;
	}

	public UltimoregistroVista(int idmonitoreo, int idunidad, int idcooperativa,
			Integer codigounidad, Date fechahora, String latitud,
			String longitud, String direccionip, Double velocidad,
			Integer idptocontrol, String estadoPuertas, Double distInstalacion,
			Double distRuta, Date fecharegistro, String rumbo,
			String variacion, Integer satelites, Double odometro,
			String calleprin, String callesec, String provincia, String ciudad) {
		
		this.idmonitoreo = idmonitoreo;
		this.idunidad = idunidad;
		this.idcooperativa = idcooperativa;
		this.codigounidad = codigounidad;
		this.fechahora = fechahora;
		this.latitud = latitud;
		this.longitud = longitud;
		this.direccionip = direccionip;
		this.velocidad = velocidad;
		this.idptocontrol = idptocontrol;
		this.estadoPuertas = estadoPuertas;
		this.distInstalacion = distInstalacion;
		this.distRuta = distRuta;
		this.fecharegistro = fecharegistro;
		this.rumbo = rumbo;
		this.variacion = variacion;
		this.satelites = satelites;
		this.odometro = odometro;
		this.calleprin = calleprin;
		this.callesec = callesec;
		this.provincia = provincia;
		this.ciudad = ciudad;
	}
	
	
	
	
	/**
	 * @param idmonitoreo
	 * @param idunidad
	 * @param codigounidad
	 * @param fechahora
	 * @param latitud
	 * @param longitud
	 * @param direccionip
	 * @param velocidad
	 * @param calleprin
	 * @param callesec
	 * @param provincia
	 * @param ciudad
	 * @param tipotrama
	 * @param estadoequipo
	 */
	public UltimoregistroVista(int idmonitoreo, int idunidad,
			String codMuni, String alias,
			Integer codigounidad, Date fechahora, String latitud,
			String longitud, String direccionip, Double velocidad,
			String calleprin, String callesec, String provincia, String ciudad,
			String tipotrama, String estadoequipo) {
		this.idmonitoreo = idmonitoreo;
		this.idunidad = idunidad;
		this.codigounidad = codigounidad;
		this.codMuni = codMuni;
		this.alias = alias;
		this.fechahora = fechahora;
		this.latitud = latitud;
		this.longitud = longitud;
		this.direccionip = direccionip;
		this.velocidad = velocidad;
		this.calleprin = calleprin;
		this.callesec = callesec;
		this.provincia = provincia;
		this.ciudad = ciudad;
		this.tipotrama = tipotrama;
		this.estadoequipo = estadoequipo;
	}

	public int getIdmonitoreo() {
		return idmonitoreo;
	}

	public void setIdmonitoreo(int idmonitoreo) {
		this.idmonitoreo = idmonitoreo;
	}

	public int getIdunidad() {
		return idunidad;
	}

	public void setIdunidad(int idunidad) {
		this.idunidad = idunidad;
	}

	public int getIdcooperativa() {
		return idcooperativa;
	}

	public void setIdcooperativa(int idcooperativa) {
		this.idcooperativa = idcooperativa;
	}

	public Integer getCodigounidad() {
		return codigounidad;
	}

	public void setCodigounidad(Integer codigounidad) {
		this.codigounidad = codigounidad;
	}

	public Date getFechahora() {
		return fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getDireccionip() {
		return direccionip;
	}

	public void setDireccionip(String direccionip) {
		this.direccionip = direccionip;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}

	public Integer getIdptocontrol() {
		return idptocontrol;
	}

	public void setIdptocontrol(Integer idptocontrol) {
		this.idptocontrol = idptocontrol;
	}

	public String getEstadoPuertas() {
		return estadoPuertas;
	}

	public void setEstadoPuertas(String estadoPuertas) {
		this.estadoPuertas = estadoPuertas;
	}

	public Double getDistInstalacion() {
		return distInstalacion;
	}

	public void setDistInstalacion(Double distInstalacion) {
		this.distInstalacion = distInstalacion;
	}

	public Double getDistRuta() {
		return distRuta;
	}

	public void setDistRuta(Double distRuta) {
		this.distRuta = distRuta;
	}

	public Date getFecharegistro() {
		return fecharegistro;
	}

	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}

	public String getRumbo() {
		return rumbo;
	}

	public void setRumbo(String rumbo) {
		this.rumbo = rumbo;
	}

	public String getVariacion() {
		return variacion;
	}

	public void setVariacion(String variacion) {
		this.variacion = variacion;
	}

	public Integer getSatelites() {
		return satelites;
	}

	public void setSatelites(Integer satelites) {
		this.satelites = satelites;
	}

	public Double getOdometro() {
		return odometro;
	}

	public void setOdometro(Double odometro) {
		this.odometro = odometro;
	}

	public String getCalleprin() {
		return calleprin;
	}

	public void setCalleprin(String calleprin) {
		this.calleprin = calleprin;
	}

	public String getCallesec() {
		return callesec;
	}

	public void setCallesec(String callesec) {
		this.callesec = callesec;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTipotrama() {
		return tipotrama;
	}

	public void setTipotrama(String tipotrama) {
		this.tipotrama = tipotrama;
	}

	public String getEstadoequipo() {
		return estadoequipo;
	}

	public void setEstadoequipo(String estadoequipo) {
		this.estadoequipo = estadoequipo;
	}

	public String getCodMuni() {
		return codMuni;
	}

	public void setCodMuni(String codMuni) {
		this.codMuni = codMuni;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}
	
	
	
}
