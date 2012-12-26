package com.backing;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.annotation.PostConstruct;

import javax.ejb.EJB;

import org.hibernate.type.AnyType;

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
 	
	@PostConstruct
	public void init() {
		
		if (coopHome == null) {
			//nuevo 
			coopHome = new ColasHome();
		}
		
		llenaTabla();
	}

	public void llenaTabla(){
	
//		lista = new ArrayList<UltimoregistroVista>();  

//		colas = coopHome.getMonitoreo();
//		
//		for (Object[] element : colas) {
//			lista.add(new UltimoregistroVista( Integer.parseInt(element[0].toString())));
//		}
		
		othlista = coopHome.getIdUni();
		
		listaData = new UltimoregistroVistaData(othlista);
		
		
		
//		System.out.println(othlista);

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



	
	
}
