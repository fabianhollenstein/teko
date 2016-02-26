/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * Dient Zur Kommunikation mit dem GUI, die DB Objekte dürfen nicht direkt angesprochen werden
 * @author Fabian
 *
 */
@ManagedBean
@ViewScoped
public class FormProjekt {
	
	public FormProjekt() {
		projektstatuse = Arrays.asList(Projektstatus.class.getEnumConstants());
	
	}
	
	//TODO the File have to be here, when you save projekt check the file and add it to the projekt in projektSErvice class
	private int mitarbeiterId;
	private int vorgehensmodellId;
	
	private Projekt projekt = new Projekt();
	
	public Projekt getProjekt() {
		return projekt;
	}
	
	public void setProjekt(Projekt projekt) {
		if(projekt.getProjektleiter() != null) {
			this.mitarbeiterId = projekt.getProjektleiter().getId();
		}
		if(projekt.getVorgehensmodell() != null) {
			this.vorgehensmodellId = projekt.getVorgehensmodell().getId();
		}
		if(projekt.getStatus() != null) {
			this.status = Integer.parseInt(projekt.getStatus());
		}
		
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
	
	
private int status;
	
	private List<Projektstatus> projektstatuse;
	
	public List<Projektstatus> getProjektstatuse() {
		return projektstatuse;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	
}
