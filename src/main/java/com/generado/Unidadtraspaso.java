package com.generado;

// Generated 11-dic-2012 20:33:51 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Unidadtraspaso generated by hbm2java
 */
@Entity
@Table(name = "unidadtraspaso")
public class Unidadtraspaso implements java.io.Serializable {

	private int idunidad;
	private Integer zocodins;
	private Integer zocodunicoop;
	private Integer zocoduni;
	private Date zofecins;
	private String zoestunidad;
	private String zoestservicio;
	private String zoestcarrera;
	private String zoestmecanica;
	private String zocomere;
	private Integer zocodciudad;
	private Integer zocodzon;
	private String zodesuni;
	private String zoplacas;
	private String zonumdis;
	private Integer zonumpas;
	private Integer zomarfac;
	private String zotipmar;
	private String zotipcla;
	private String zotipveh;
	private Integer zoanofab;
	private String zomodelo;
	private String zopaisor;
	private String zonummot;
	private String zonumcha;
	private String zocolore;
	private String zootrinf;
	private String zonomdue;
	private String zodirdue;
	private String zoceldue;
	private String zoteldue;
	private String zonumtel;
	private String zopuerto;
	private String zocoddis;
	private Date zofeceve;
	private Double zolatitud;
	private Double zolongitud;
	private Integer zoveloci;
	private Integer zopuncon;
	private Integer zocoluni;
	private Integer zomareme;
	private Date zofeceme;
	private String zohoreme;
	private String zonumime;
	private String zonumchi;
	private Integer zomarina;
	private String zocodrut;
	private String zohorsal;
	private Date zofecevev;
	private Integer zonumvue;
	private Integer zocodsec;
	private Integer zopassub;
	private Integer zopasbaj;
	private Integer zopasabo;
	private Integer sicodusu;
	private Date sifecreg;

	public Unidadtraspaso() {
	}

	public Unidadtraspaso(int idunidad) {
		this.idunidad = idunidad;
	}

	public Unidadtraspaso(int idunidad, Integer zocodins, Integer zocodunicoop,
			Integer zocoduni, Date zofecins, String zoestunidad,
			String zoestservicio, String zoestcarrera, String zoestmecanica,
			String zocomere, Integer zocodciudad, Integer zocodzon,
			String zodesuni, String zoplacas, String zonumdis,
			Integer zonumpas, Integer zomarfac, String zotipmar,
			String zotipcla, String zotipveh, Integer zoanofab,
			String zomodelo, String zopaisor, String zonummot, String zonumcha,
			String zocolore, String zootrinf, String zonomdue, String zodirdue,
			String zoceldue, String zoteldue, String zonumtel, String zopuerto,
			String zocoddis, Date zofeceve, Double zolatitud,
			Double zolongitud, Integer zoveloci, Integer zopuncon,
			Integer zocoluni, Integer zomareme, Date zofeceme, String zohoreme,
			String zonumime, String zonumchi, Integer zomarina,
			String zocodrut, String zohorsal, Date zofecevev, Integer zonumvue,
			Integer zocodsec, Integer zopassub, Integer zopasbaj,
			Integer zopasabo, Integer sicodusu, Date sifecreg) {
		this.idunidad = idunidad;
		this.zocodins = zocodins;
		this.zocodunicoop = zocodunicoop;
		this.zocoduni = zocoduni;
		this.zofecins = zofecins;
		this.zoestunidad = zoestunidad;
		this.zoestservicio = zoestservicio;
		this.zoestcarrera = zoestcarrera;
		this.zoestmecanica = zoestmecanica;
		this.zocomere = zocomere;
		this.zocodciudad = zocodciudad;
		this.zocodzon = zocodzon;
		this.zodesuni = zodesuni;
		this.zoplacas = zoplacas;
		this.zonumdis = zonumdis;
		this.zonumpas = zonumpas;
		this.zomarfac = zomarfac;
		this.zotipmar = zotipmar;
		this.zotipcla = zotipcla;
		this.zotipveh = zotipveh;
		this.zoanofab = zoanofab;
		this.zomodelo = zomodelo;
		this.zopaisor = zopaisor;
		this.zonummot = zonummot;
		this.zonumcha = zonumcha;
		this.zocolore = zocolore;
		this.zootrinf = zootrinf;
		this.zonomdue = zonomdue;
		this.zodirdue = zodirdue;
		this.zoceldue = zoceldue;
		this.zoteldue = zoteldue;
		this.zonumtel = zonumtel;
		this.zopuerto = zopuerto;
		this.zocoddis = zocoddis;
		this.zofeceve = zofeceve;
		this.zolatitud = zolatitud;
		this.zolongitud = zolongitud;
		this.zoveloci = zoveloci;
		this.zopuncon = zopuncon;
		this.zocoluni = zocoluni;
		this.zomareme = zomareme;
		this.zofeceme = zofeceme;
		this.zohoreme = zohoreme;
		this.zonumime = zonumime;
		this.zonumchi = zonumchi;
		this.zomarina = zomarina;
		this.zocodrut = zocodrut;
		this.zohorsal = zohorsal;
		this.zofecevev = zofecevev;
		this.zonumvue = zonumvue;
		this.zocodsec = zocodsec;
		this.zopassub = zopassub;
		this.zopasbaj = zopasbaj;
		this.zopasabo = zopasabo;
		this.sicodusu = sicodusu;
		this.sifecreg = sifecreg;
	}

	@Id
	@Column(name = "idunidad", unique = true, nullable = false)
	public int getIdunidad() {
		return this.idunidad;
	}

	public void setIdunidad(int idunidad) {
		this.idunidad = idunidad;
	}

	@Column(name = "zocodins")
	public Integer getZocodins() {
		return this.zocodins;
	}

	public void setZocodins(Integer zocodins) {
		this.zocodins = zocodins;
	}

	@Column(name = "zocodunicoop")
	public Integer getZocodunicoop() {
		return this.zocodunicoop;
	}

	public void setZocodunicoop(Integer zocodunicoop) {
		this.zocodunicoop = zocodunicoop;
	}

	@Column(name = "zocoduni")
	public Integer getZocoduni() {
		return this.zocoduni;
	}

	public void setZocoduni(Integer zocoduni) {
		this.zocoduni = zocoduni;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "zofecins", length = 22)
	public Date getZofecins() {
		return this.zofecins;
	}

	public void setZofecins(Date zofecins) {
		this.zofecins = zofecins;
	}

	@Column(name = "zoestunidad", length = 5)
	public String getZoestunidad() {
		return this.zoestunidad;
	}

	public void setZoestunidad(String zoestunidad) {
		this.zoestunidad = zoestunidad;
	}

	@Column(name = "zoestservicio", length = 5)
	public String getZoestservicio() {
		return this.zoestservicio;
	}

	public void setZoestservicio(String zoestservicio) {
		this.zoestservicio = zoestservicio;
	}

	@Column(name = "zoestcarrera", length = 5)
	public String getZoestcarrera() {
		return this.zoestcarrera;
	}

	public void setZoestcarrera(String zoestcarrera) {
		this.zoestcarrera = zoestcarrera;
	}

	@Column(name = "zoestmecanica", length = 5)
	public String getZoestmecanica() {
		return this.zoestmecanica;
	}

	public void setZoestmecanica(String zoestmecanica) {
		this.zoestmecanica = zoestmecanica;
	}

	@Column(name = "zocomere", length = 5)
	public String getZocomere() {
		return this.zocomere;
	}

	public void setZocomere(String zocomere) {
		this.zocomere = zocomere;
	}

	@Column(name = "zocodciudad")
	public Integer getZocodciudad() {
		return this.zocodciudad;
	}

	public void setZocodciudad(Integer zocodciudad) {
		this.zocodciudad = zocodciudad;
	}

	@Column(name = "zocodzon")
	public Integer getZocodzon() {
		return this.zocodzon;
	}

	public void setZocodzon(Integer zocodzon) {
		this.zocodzon = zocodzon;
	}

	@Column(name = "zodesuni")
	public String getZodesuni() {
		return this.zodesuni;
	}

	public void setZodesuni(String zodesuni) {
		this.zodesuni = zodesuni;
	}

	@Column(name = "zoplacas")
	public String getZoplacas() {
		return this.zoplacas;
	}

	public void setZoplacas(String zoplacas) {
		this.zoplacas = zoplacas;
	}

	@Column(name = "zonumdis")
	public String getZonumdis() {
		return this.zonumdis;
	}

	public void setZonumdis(String zonumdis) {
		this.zonumdis = zonumdis;
	}

	@Column(name = "zonumpas")
	public Integer getZonumpas() {
		return this.zonumpas;
	}

	public void setZonumpas(Integer zonumpas) {
		this.zonumpas = zonumpas;
	}

	@Column(name = "zomarfac")
	public Integer getZomarfac() {
		return this.zomarfac;
	}

	public void setZomarfac(Integer zomarfac) {
		this.zomarfac = zomarfac;
	}

	@Column(name = "zotipmar")
	public String getZotipmar() {
		return this.zotipmar;
	}

	public void setZotipmar(String zotipmar) {
		this.zotipmar = zotipmar;
	}

	@Column(name = "zotipcla")
	public String getZotipcla() {
		return this.zotipcla;
	}

	public void setZotipcla(String zotipcla) {
		this.zotipcla = zotipcla;
	}

	@Column(name = "zotipveh")
	public String getZotipveh() {
		return this.zotipveh;
	}

	public void setZotipveh(String zotipveh) {
		this.zotipveh = zotipveh;
	}

	@Column(name = "zoanofab")
	public Integer getZoanofab() {
		return this.zoanofab;
	}

	public void setZoanofab(Integer zoanofab) {
		this.zoanofab = zoanofab;
	}

	@Column(name = "zomodelo")
	public String getZomodelo() {
		return this.zomodelo;
	}

	public void setZomodelo(String zomodelo) {
		this.zomodelo = zomodelo;
	}

	@Column(name = "zopaisor")
	public String getZopaisor() {
		return this.zopaisor;
	}

	public void setZopaisor(String zopaisor) {
		this.zopaisor = zopaisor;
	}

	@Column(name = "zonummot")
	public String getZonummot() {
		return this.zonummot;
	}

	public void setZonummot(String zonummot) {
		this.zonummot = zonummot;
	}

	@Column(name = "zonumcha")
	public String getZonumcha() {
		return this.zonumcha;
	}

	public void setZonumcha(String zonumcha) {
		this.zonumcha = zonumcha;
	}

	@Column(name = "zocolore")
	public String getZocolore() {
		return this.zocolore;
	}

	public void setZocolore(String zocolore) {
		this.zocolore = zocolore;
	}

	@Column(name = "zootrinf")
	public String getZootrinf() {
		return this.zootrinf;
	}

	public void setZootrinf(String zootrinf) {
		this.zootrinf = zootrinf;
	}

	@Column(name = "zonomdue")
	public String getZonomdue() {
		return this.zonomdue;
	}

	public void setZonomdue(String zonomdue) {
		this.zonomdue = zonomdue;
	}

	@Column(name = "zodirdue")
	public String getZodirdue() {
		return this.zodirdue;
	}

	public void setZodirdue(String zodirdue) {
		this.zodirdue = zodirdue;
	}

	@Column(name = "zoceldue")
	public String getZoceldue() {
		return this.zoceldue;
	}

	public void setZoceldue(String zoceldue) {
		this.zoceldue = zoceldue;
	}

	@Column(name = "zoteldue")
	public String getZoteldue() {
		return this.zoteldue;
	}

	public void setZoteldue(String zoteldue) {
		this.zoteldue = zoteldue;
	}

	@Column(name = "zonumtel")
	public String getZonumtel() {
		return this.zonumtel;
	}

	public void setZonumtel(String zonumtel) {
		this.zonumtel = zonumtel;
	}

	@Column(name = "zopuerto")
	public String getZopuerto() {
		return this.zopuerto;
	}

	public void setZopuerto(String zopuerto) {
		this.zopuerto = zopuerto;
	}

	@Column(name = "zocoddis")
	public String getZocoddis() {
		return this.zocoddis;
	}

	public void setZocoddis(String zocoddis) {
		this.zocoddis = zocoddis;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "zofeceve", length = 22)
	public Date getZofeceve() {
		return this.zofeceve;
	}

	public void setZofeceve(Date zofeceve) {
		this.zofeceve = zofeceve;
	}

	@Column(name = "zolatitud", precision = 17, scale = 17)
	public Double getZolatitud() {
		return this.zolatitud;
	}

	public void setZolatitud(Double zolatitud) {
		this.zolatitud = zolatitud;
	}

	@Column(name = "zolongitud", precision = 17, scale = 17)
	public Double getZolongitud() {
		return this.zolongitud;
	}

	public void setZolongitud(Double zolongitud) {
		this.zolongitud = zolongitud;
	}

	@Column(name = "zoveloci")
	public Integer getZoveloci() {
		return this.zoveloci;
	}

	public void setZoveloci(Integer zoveloci) {
		this.zoveloci = zoveloci;
	}

	@Column(name = "zopuncon")
	public Integer getZopuncon() {
		return this.zopuncon;
	}

	public void setZopuncon(Integer zopuncon) {
		this.zopuncon = zopuncon;
	}

	@Column(name = "zocoluni")
	public Integer getZocoluni() {
		return this.zocoluni;
	}

	public void setZocoluni(Integer zocoluni) {
		this.zocoluni = zocoluni;
	}

	@Column(name = "zomareme")
	public Integer getZomareme() {
		return this.zomareme;
	}

	public void setZomareme(Integer zomareme) {
		this.zomareme = zomareme;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "zofeceme", length = 22)
	public Date getZofeceme() {
		return this.zofeceme;
	}

	public void setZofeceme(Date zofeceme) {
		this.zofeceme = zofeceme;
	}

	@Column(name = "zohoreme", length = 8)
	public String getZohoreme() {
		return this.zohoreme;
	}

	public void setZohoreme(String zohoreme) {
		this.zohoreme = zohoreme;
	}

	@Column(name = "zonumime")
	public String getZonumime() {
		return this.zonumime;
	}

	public void setZonumime(String zonumime) {
		this.zonumime = zonumime;
	}

	@Column(name = "zonumchi")
	public String getZonumchi() {
		return this.zonumchi;
	}

	public void setZonumchi(String zonumchi) {
		this.zonumchi = zonumchi;
	}

	@Column(name = "zomarina")
	public Integer getZomarina() {
		return this.zomarina;
	}

	public void setZomarina(Integer zomarina) {
		this.zomarina = zomarina;
	}

	@Column(name = "zocodrut", length = 1)
	public String getZocodrut() {
		return this.zocodrut;
	}

	public void setZocodrut(String zocodrut) {
		this.zocodrut = zocodrut;
	}

	@Column(name = "zohorsal", length = 8)
	public String getZohorsal() {
		return this.zohorsal;
	}

	public void setZohorsal(String zohorsal) {
		this.zohorsal = zohorsal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "zofecevev", length = 22)
	public Date getZofecevev() {
		return this.zofecevev;
	}

	public void setZofecevev(Date zofecevev) {
		this.zofecevev = zofecevev;
	}

	@Column(name = "zonumvue")
	public Integer getZonumvue() {
		return this.zonumvue;
	}

	public void setZonumvue(Integer zonumvue) {
		this.zonumvue = zonumvue;
	}

	@Column(name = "zocodsec")
	public Integer getZocodsec() {
		return this.zocodsec;
	}

	public void setZocodsec(Integer zocodsec) {
		this.zocodsec = zocodsec;
	}

	@Column(name = "zopassub")
	public Integer getZopassub() {
		return this.zopassub;
	}

	public void setZopassub(Integer zopassub) {
		this.zopassub = zopassub;
	}

	@Column(name = "zopasbaj")
	public Integer getZopasbaj() {
		return this.zopasbaj;
	}

	public void setZopasbaj(Integer zopasbaj) {
		this.zopasbaj = zopasbaj;
	}

	@Column(name = "zopasabo")
	public Integer getZopasabo() {
		return this.zopasabo;
	}

	public void setZopasabo(Integer zopasabo) {
		this.zopasabo = zopasabo;
	}

	@Column(name = "sicodusu")
	public Integer getSicodusu() {
		return this.sicodusu;
	}

	public void setSicodusu(Integer sicodusu) {
		this.sicodusu = sicodusu;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sifecreg", length = 22)
	public Date getSifecreg() {
		return this.sifecreg;
	}

	public void setSifecreg(Date sifecreg) {
		this.sifecreg = sifecreg;
	}

}
