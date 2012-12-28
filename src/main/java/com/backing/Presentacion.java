package com.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.annotation.PostConstruct;

import javax.ejb.EJB;

import org.hibernate.type.AnyType;
import org.primefaces.event.map.OverlaySelectEvent;  
import org.primefaces.model.map.DefaultMapModel;  
import org.primefaces.model.map.LatLng;  
import org.primefaces.model.map.MapModel;  
import org.primefaces.model.map.Marker;

import com.generado.Colas;
import com.generado.ColasHome;
import com.generado.Cooperativa;
import com.generado.CooperativaHome;
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
	
	private List<UltimoregistroVista> lista;
	
	private List<UltimoregistroVista> othlista;
	
	private UltimoregistroVistaData listaData;
 	
	private MapModel advancedModel;
	
	private Marker marker;  
	
	private double lati;
	
	private double longi;
	
	@PostConstruct
	public void init() {
		
		if (coopHome == null) {
			//nuevo 
			coopHome = new ColasHome();
		}
		
		advancedModel = new DefaultMapModel();   
        
		llenaTabla();
	}

	public void llenaTabla(){
		
		othlista = coopHome.getIdUni();
		
		listaData = new UltimoregistroVistaData(othlista);
		
	}
	
	public void verMapa(){
		
		advancedModel = new DefaultMapModel(); 
		
		for (UltimoregistroVista elem : seleccionados) {
			
			lati = Double.parseDouble(elem.getLatitud());
			longi = Double.parseDouble(elem.getLongitud());
			
			LatLng coord1 = new LatLng(Double.parseDouble(elem.getLatitud()), Double.parseDouble(elem.getLongitud())); 
			
			Marker mymarker = new Marker(coord1, String.valueOf(elem.getIdunidad()), elem.getIdunidad() );
			
			mymarker.setIcon("http://www.google.com/mapfiles/markerA.png");
			
			advancedModel.addOverlay(mymarker); 
		}
		
		
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



	
	
}
