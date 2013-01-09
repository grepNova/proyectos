package com.backing;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.annotation.PostConstruct;

import javax.ejb.EJB;

import org.primefaces.event.map.OverlaySelectEvent;  
import org.primefaces.model.map.DefaultMapModel;  
import org.primefaces.model.map.LatLng;  
import org.primefaces.model.map.MapModel;  
import org.primefaces.model.map.Marker;

import com.generado.Colas;
import com.generado.ColasHome;
import com.view.UltimoregistroVista;
import com.view.UltimoregistroVistaData;



@ManagedBean
@SessionScoped
public class Presentacion {
	

	private Colas cooperativa;

	@EJB
	private ColasHome coopHome;
	
	private List<Object[]> colas;
	
	private UltimoregistroVista[] seleccionados;
	
	private UltimoregistroVista[] seleccionadosFiltro;
	
	private List<UltimoregistroVista> lista;
	
	private List<UltimoregistroVista> othlista;
	
	private UltimoregistroVistaData listaData;
	
	private UltimoregistroVistaData listaDataFiltro;
 	
	private MapModel advancedModel;
	
	private Marker marker;  
	
	private double lati;
	
	private double longi;
	
	private String strWhere;
	

	@PostConstruct
	public void init() {
		
		if (coopHome == null) {
			//nuevo 
			coopHome = new ColasHome();
		}
		
		advancedModel = new DefaultMapModel();   
		strWhere = "";
		llenaTabla();
	}

	
	public UltimoregistroVistaData getListaDataFiltro() {
		return listaDataFiltro;
	}


	public void setListaDataFiltro(UltimoregistroVistaData listaDataFiltro) {
		this.listaDataFiltro = listaDataFiltro;
	}


	public void llenaTabla(){
		
		othlista = coopHome.getIdUni("");
		
		listaData = new UltimoregistroVistaData(othlista);
		
	}
	
	public void llenaFiltro(){
		
		othlista = coopHome.getIdUni(strWhere);
		
		listaDataFiltro = new UltimoregistroVistaData(othlista);
		
	}
	
	public void verMapa(){
		
		advancedModel = new DefaultMapModel(); 
		
		for (UltimoregistroVista elem : seleccionados) {
			
			lati = Double.parseDouble(elem.getLatitud());
			
			longi = Double.parseDouble(elem.getLongitud());
			
			LatLng coord1 = new LatLng(Double.parseDouble(elem.getLatitud()), Double.parseDouble(elem.getLongitud())); 
			
			String mensaje = "<div> " +
					"<table style='font-size: .8em;' >" +
					"<tr><th>Idunidad:</th><td>"+ String.valueOf(elem.getIdunidad()) + "</td></tr> " +
					"<tr><th>Unidad: </th><td>" + elem.getCodigounidad() + "</td></tr> " +
					"<tr><th>Muni: </th><td>" + elem.getCodMuni() + "</td></tr> " +
					"<tr><th>Alias: </th><td>" + elem.getAlias() + "</td></tr> " +
					"<tr><th>Prov: </th><td>" + elem.getProvincia() + "</td></tr> " +
					"<tr><th>Cuidad: </th><td>" + elem.getCiudad() + "</td></tr> " +
					"<tr><th>Prin: </th><td>" + elem.getCalleprin() + "</td></tr> " +
					"<tr><th>Sec: </th><td>" + elem.getCallesec() + "</td></tr> " +
					"<tr><th>Trama: </th><td>" + elem.getTipotrama() + "</td></tr> " +
					"<tr><th>Equipo</th><td>"+ elem.getEstadoequipo() +"</td></tr> " +
					"</table>" +
					"</div>";
			
			Marker mymarker = new Marker(coord1, String.valueOf(elem.getIdunidad()), (mensaje) );
			
			mymarker.setIcon("http://www.google.com/mapfiles/markerA.png");
			
			advancedModel.addOverlay(mymarker); 
		}
		
		
	}
	
	public void verMapaFiltro(){
		
		advancedModel = new DefaultMapModel(); 
		
		for (UltimoregistroVista elem : seleccionadosFiltro) {
			
			lati = Double.parseDouble(elem.getLatitud());
			
			longi = Double.parseDouble(elem.getLongitud());
			
			LatLng coord1 = new LatLng(Double.parseDouble(elem.getLatitud()), Double.parseDouble(elem.getLongitud())); 
			
			String mensaje = "<div> " +
					"<table style='font-size: .8em;' >" +
					"<tr><th>Idunidad:</th><td>"+ String.valueOf(elem.getIdunidad()) + "</td></tr> " +
					"<tr><th>Unidad: </th><td>" + elem.getCodigounidad() + "</td></tr> " +
					"<tr><th>Muni: </th><td>" + elem.getCodMuni() + "</td></tr> " +
					"<tr><th>Alias: </th><td>" + elem.getAlias() + "</td></tr> " +
					"<tr><th>Prov: </th><td>" + elem.getProvincia() + "</td></tr> " +
					"<tr><th>Cuidad: </th><td>" + elem.getCiudad() + "</td></tr> " +
					"<tr><th>Prin: </th><td>" + elem.getCalleprin() + "</td></tr> " +
					"<tr><th>Sec: </th><td>" + elem.getCallesec() + "</td></tr> " +
					"<tr><th>Trama: </th><td>" + elem.getTipotrama() + "</td></tr> " +
					"<tr><th>Equipo</th><td>"+ elem.getEstadoequipo() +"</td></tr> " +
					"</table>" +
					"</div>";
			
			Marker mymarker = new Marker(coord1, String.valueOf(elem.getIdunidad()), (mensaje) );
			
			mymarker.setIcon("http://www.google.com/mapfiles/markerA.png");
			
			advancedModel.addOverlay(mymarker); 
		}
	}
	
	
	public void mapaIndividual(UltimoregistroVista elem){
		
		seleccionados = new UltimoregistroVista[1];
		
		seleccionados[0] = elem;
		
		verMapa();
		
	}
	
    public void onMarkerSelect(OverlaySelectEvent event) {  
        marker = (Marker) event.getOverlay();  
    }
    
	public MapModel getAdvancedModel() {
		return advancedModel;
	}

	public void setAdvancedModel(MapModel advancedModel) {
		this.advancedModel = advancedModel;
	}

	public UltimoregistroVista[] getSeleccionados() {
		return seleccionados;
	}

	public void setSeleccionados(UltimoregistroVista[] seleccionados) {
		this.seleccionados = seleccionados;
	}

	public List<UltimoregistroVista> getLista() {
		return lista;
	}

	public void setLista(List<UltimoregistroVista> lista) {
		this.lista = lista;
	}

	public UltimoregistroVistaData getListaData() {
		return listaData;
	}

	public void setListaData(UltimoregistroVistaData listaData) {
		this.listaData = listaData;
	}

	public List<Object[]> getColas() {
		return colas;
	}


	public void setColas(List<Object[]> colas) {
		this.colas = colas;
	}


	public Colas getCooperativa() {
		return cooperativa;
	}

	public void setCooperativa(Colas cooperativa) {
		this.cooperativa = cooperativa;
	}

	public ColasHome getCoopHome() {
		return coopHome;
	}

	public void setCoopHome(ColasHome coopHome) {
		this.coopHome = coopHome;
	}

	public Marker getMarker() {
		return marker;
	}

	public void setMarker(Marker marker) {
		this.marker = marker;
	}

	public double getLati() {
		return lati;
	}

	public void setLati(double lati) {
		this.lati = lati;
	}

	public double getLongi() {
		return longi;
	}

	public void setLongi(double longi) {
		this.longi = longi;
	}


	public String getStrWhere() {
		return strWhere;
	}

	public void setStrWhere(String strWhere) {
		this.strWhere = strWhere;
	}


	public UltimoregistroVista[] getSeleccionadosFiltro() {
		return seleccionadosFiltro;
	}


	public void setSeleccionadosFiltro(UltimoregistroVista[] seleccionadosFiltro) {
		this.seleccionadosFiltro = seleccionadosFiltro;
	}
	
	
	
}
