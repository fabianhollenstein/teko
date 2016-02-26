/**
 * 
 */
package ch.teko.projektverwaltung.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Dient Zur Kommunikation mit dem GUI, die DB Objekte dürfen nicht direkt angesprochen werden
 * @author Fabian
 *
 */
@ManagedBean
@ViewScoped
public class FormMitarbeiter {
	private String[] funktionIds;
	
	
	private Mitarbeiter mitarbeiter = new Mitarbeiter();
	
	public Mitarbeiter getMitarbeiter() {
 		
		return mitarbeiter;
	}
	
	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		funktionIds = new String[mitarbeiter.getFunktionen().size()];
		int index = 0;
		for(Funktion funktion : mitarbeiter.getFunktionen()) {
			funktionIds[index] = "" + funktion.getId();
			index++;
		}
		
		this.mitarbeiter = mitarbeiter;
	}

	public String[] getFunktionIds() {
		return funktionIds;
	}

	public void setFunktionIds(String[] funktionIds) {
		this.funktionIds = funktionIds;
	}


	
	
}
