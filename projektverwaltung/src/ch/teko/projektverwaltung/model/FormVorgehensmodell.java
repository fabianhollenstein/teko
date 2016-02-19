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
	
	private Vorgehensmodell vorgehensmodell = new Vorgehensmodell();
	
	public Vorgehensmodell getVorgehensmodell() {
 		return vorgehensmodell;
	}
	
	public void setVorgehensmodell(Vorgehensmodell vorgehensmodell) {
		this.vorgehensmodell = vorgehensmodell;
	}
}
