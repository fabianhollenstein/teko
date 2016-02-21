/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * @author Fabian
 * Class is used for Formular
 */
@ManagedBean
@SessionScoped
public class FormProjektAktivitaeten {
	
	public FormProjektAktivitaeten() {
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
		List<Projektphase> projektphasen = new ArrayList<Projektphase>();
		Vorgehensmodell vorgehensmodell = projekt.getVorgehensmodell();
		for(Phase phase: vorgehensmodell.getPhasen()){
			Projektphase projektphase = new Projektphase();
			projektphase.setName(phase.getName());
			projektphasen.add(projektphase);
		}
		projekt.setProjektphasen(projektphasen);
		
		
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
	
	public String sendProjekt(Projekt projekt) {
		this.projekt = projekt;
		return Navigation.PROJEKTAKTIVITAETEN_VIEW;
		
//		FacesContext facesContext = FacesContext.getCurrentInstance();
		
		
	}
	
	
}
