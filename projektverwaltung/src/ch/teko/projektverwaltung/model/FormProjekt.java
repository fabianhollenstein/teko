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
	
	private Projekt projekt = new Projekt();
	
	public Projekt getProjekt() {
		return projekt;
	}
	
	public void setMitarbeiter(Projekt mitarbeiter) {
		this.projekt = mitarbeiter;
	}
}
