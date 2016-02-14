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
public class FormFunktion {
	
	private Funktion funktion;
	
	public Funktion getFunktion() {
		Funktion currentFunktion = null;
		if(funktion != null) {
			currentFunktion = funktion;
		} else {
			currentFunktion = new Funktion();
			this.funktion = currentFunktion;
		}
		return currentFunktion;
	}
	
	public void setFunktion(Funktion funktion) {
		this.funktion = funktion;
	}
}
