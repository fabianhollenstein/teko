package ch.teko.projektverwaltung.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
/**
 * Helfer Klasse für Dorpbdown box
 * @author Fabian
 *
 */
@ManagedBean
@ViewScoped
public class FunktionItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5452290220589104070L;

	private int id;
	
	private String[] ids;
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String[] getIds() {
		return ids;
	}

	public void setIds(String[] ids) {
		this.ids = ids;
	}
	
//	public void addId(int id) {
//		this.ids.add(id);
//	}
//	public List<Integer> getIds() {
//		return ids;
//	}
	
    

}
