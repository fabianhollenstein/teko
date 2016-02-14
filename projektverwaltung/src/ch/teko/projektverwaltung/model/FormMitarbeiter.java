/**
 * 
 */
package ch.teko.projektverwaltung.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Fabian
 *
 */
@ManagedBean
@ViewScoped
public class FormMitarbeiter {
	
	private Mitarbeiter mitarbeiter;
	
	public Mitarbeiter getMitarbeiter() {
 		Mitarbeiter currentMitarbeiter = null;
		if(mitarbeiter != null) {
			currentMitarbeiter = mitarbeiter;
		} else {
			currentMitarbeiter = new Mitarbeiter();
			this.mitarbeiter = currentMitarbeiter;
		}
		return currentMitarbeiter;
	}
	
	public void setMitarbeiter(Mitarbeiter mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}
}
