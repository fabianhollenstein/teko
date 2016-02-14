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
public class FormKostenart {
	
	private Kostenart kostenart;
	
	public Kostenart getKostenart() {
		Kostenart currentKostenart = null;
		if(kostenart != null) {
			currentKostenart = kostenart;
		} else {
			currentKostenart = new Kostenart();
			this.kostenart = currentKostenart;
		}
		return currentKostenart;
	}
	
	public void setKostenart(Kostenart kostenart) {
		this.kostenart = kostenart;
	}
}
