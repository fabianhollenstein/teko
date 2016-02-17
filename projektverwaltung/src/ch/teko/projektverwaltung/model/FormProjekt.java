/**
 * 
 */
package ch.teko.projektverwaltung.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Fabian
 * Class is used for Formular
 */
@ManagedBean
@ViewScoped
public class FormProjekt {
	
	private Projekt projekt;
	
	public Projekt getProjekt() {
		Projekt currentProjekt = null;
		if(projekt != null) {
			currentProjekt = projekt;
		} else {
			currentProjekt = new Projekt();
			this.projekt = currentProjekt;
		}
		return currentProjekt;
	}
	
	public void setMitarbeiter(Projekt mitarbeiter) {
		this.projekt = mitarbeiter;
	}
}
