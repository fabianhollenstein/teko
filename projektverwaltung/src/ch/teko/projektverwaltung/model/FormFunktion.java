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
public class FormFunktion {
	
	private Funktion funktion = new Funktion();
	
	public Funktion getFunktion() {
		return funktion;
	}
	
	public void setFunktion(Funktion funktion) {
		this.funktion = funktion;
	}
}
