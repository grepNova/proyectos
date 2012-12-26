package com.view;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.model.ListDataModel;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.primefaces.model.SelectableDataModel;

import com.generado.Colas;
import com.generado.ColasHome;

public class UltimoregistroVistaData 
	extends ListDataModel<UltimoregistroVista> 
	implements SelectableDataModel<UltimoregistroVista>  {
	
	@EJB
	private ColasHome coopHome;
	
	public UltimoregistroVistaData(List<UltimoregistroVista> data){
		super(data);
	}
	
	
	@SuppressWarnings("unchecked")
	public UltimoregistroVista getRowData(String rowKey) {

		List<UltimoregistroVista> ulr = (List<UltimoregistroVista>) getWrappedData();  
        
        for(UltimoregistroVista ulre : ulr) {  
            if( Integer.toString(ulre.getIdunidad()).equals(rowKey))  
                return ulre;  
        } 
		
		return null;
	}

	public Object getRowKey(UltimoregistroVista ulre) {
		return ulre.getIdunidad();
	}
	
	

}
