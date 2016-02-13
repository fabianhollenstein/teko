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
public class FormVorgehensmodell {
	
	private Vorgehensmodell vorgehensmodell;
	
	public Vorgehensmodell getVorgehensmodell() {
 		Vorgehensmodell currentVorgehensmodell = null;
		if(vorgehensmodell != null) {
			currentVorgehensmodell = vorgehensmodell;
		} else {
			currentVorgehensmodell = new Vorgehensmodell();
			this.vorgehensmodell = currentVorgehensmodell;
		}
		return currentVorgehensmodell;
	}
	
	public void setVorgehensmodell(Vorgehensmodell vorgehensmodell) {
		this.vorgehensmodell = vorgehensmodell;
	}
}
