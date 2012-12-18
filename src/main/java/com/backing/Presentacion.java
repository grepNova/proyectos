package com.backing;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.annotation.PostConstruct;

import javax.ejb.EJB;

import com.generado.Colas;
import com.generado.ColasHome;
import com.generado.Cooperativa;
import com.generado.CooperativaHome;



@ManagedBean
@SessionScoped
public class Presentacion {
	

	private Colas cooperativa;

	@EJB
	private ColasHome coopHome;
	
	private List<Colas> colas;
	
	@PostConstruct
	public void init() {
		
		
		if (coopHome == null) {
			//nuevo 
			coopHome = new ColasHome();
		}	

		colas = coopHome.getImportant();

	}

	
	public List<Colas> getColas() {
		return colas;
	}


	public void setColas(List<Colas> colas) {
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
