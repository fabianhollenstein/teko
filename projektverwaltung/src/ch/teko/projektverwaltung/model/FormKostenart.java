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
public class FormKostenart {
	
	private Kostenart kostenart = new Kostenart();
	
	public Kostenart getKostenart() {
		return kostenart;
	}
	
	public void setKostenart(Kostenart kostenart) {
		this.kostenart = kostenart;
	}
}
