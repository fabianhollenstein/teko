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
	
	//TODO the File have to be here, when you save projekt check the file and add it to the projekt in projektSErvice class
	private int mitarbeiterId;
	private int vorgehensmodellId;
	
	private Projekt projekt = new Projekt();
	
	public Projekt getProjekt() {
		return projekt;
	}
	
	public void setProjekt(Projekt projekt) {
		this.mitarbeiterId = projekt.getProjektleiter().getId();
		this.vorgehensmodellId = projekt.getVorgehensmodell().getId();
		this.projekt = projekt;
	}

	public int getMitarbeiterId() {
		return mitarbeiterId;
	}

	public void setMitarbeiterId(int mitarbeiterId) {
		this.mitarbeiterId = mitarbeiterId;
	}

	public int getVorgehensmodellId() {
		return vorgehensmodellId;
	}

	public void setVorgehensmodellId(int vorgehensmodellId) {
		this.vorgehensmodellId = vorgehensmodellId;
	}
	
	
}
