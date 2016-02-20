/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * @author Fabian
 *
 */
@Entity
public class Projekt implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2787721907974399451L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String projekttitel;
	private String projektbeschreibung;
	private Date bewilligungsdatum;
	private int prioritaet;
	private String status;
	private Date startdatumSoll;
	private Date enddatumSoll;
	//TODO erst beim bearbeiten hinzufügen
	private Date startdatumIst;
	private Date enddatumIst;
	
	@ManyToOne
	private Mitarbeiter projektleiter;
	@ManyToOne
	private Vorgehensmodell vorgehensmodell;
	private int projektfortschritt;
	
	@OneToMany
	private List<Link> links;
	
	public Projekt() {
		links = new ArrayList<Link>();
		links.add(new Link());
	}
	//TODO if 
	@OneToMany
	private List<Projektphase> projektphasen;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getProjekttitel() {
		return projekttitel;
	}


	public void setProjekttitel(String projekttitel) {
		this.projekttitel = projekttitel;
	}


	public String getProjektbeschreibung() {
		return projektbeschreibung;
	}


	public void setProjektbeschreibung(String projektbeschreibung) {
		this.projektbeschreibung = projektbeschreibung;
	}


	public Date getBewilligungsdatum() {
		return bewilligungsdatum;
	}


	public void setBewilligungsdatum(Date bewilligungsdatum) {
		this.bewilligungsdatum = bewilligungsdatum;
	}


	public int getPrioritaet() {
		return prioritaet;
	}


	public void setPrioritaet(int priorität) {
		this.prioritaet = priorität;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getStartdatumSoll() {
		return startdatumSoll;
	}


	public void setStartdatumSoll(Date startdatumSoll) {
		this.startdatumSoll = startdatumSoll;
	}


	public Date getEnddatumSoll() {
		return enddatumSoll;
	}


	public void setEnddatumSoll(Date enddatumSoll) {
		this.enddatumSoll = enddatumSoll;
	}


	public Date getStartdatumIst() {
		return startdatumIst;
	}


	public void setStartdatumIst(Date startdatumIst) {
		this.startdatumIst = startdatumIst;
	}


	public Date getEnddatumIst() {
		return enddatumIst;
	}


	public void setEnddatumIst(Date enddatumIst) {
		this.enddatumIst = enddatumIst;
	}


	public Mitarbeiter getProjektleiter() {
		return projektleiter;
	}


	public void setProjektleiter(Mitarbeiter projektleiter) {
		this.projektleiter = projektleiter;
	}


	public Vorgehensmodell getVorgehensmodell() {
		return vorgehensmodell;
	}


	public void setVorgehensmodell(Vorgehensmodell vorgehensmodell) {
		this.vorgehensmodell = vorgehensmodell;
	}


	public int getProjektfortschritt() {
		return projektfortschritt;
	}


	public void setProjektfortschritt(int projektfortschritt) {
		this.projektfortschritt = projektfortschritt;
	}


	public List<Link> getLinks() {
		return links;
	}


	public void setLinks(List<Link> links) {
		this.links = links;
	}
	
	public void onButtonRemoveLink(final Link link) {
		links.remove(link);
	}
	
	public void onButtonAddFieldLink() {
		links.add(new Link());
	}


	public List<Projektphase> getProjektphasen() {
		return projektphasen;
	}


	public void setProjektphasen(List<Projektphase> projektphasen) {
		this.projektphasen = projektphasen;
	}
	
	//TODO is this necessary?
	public void addProjektphase(Projektphase projektphase) {
		projektphasen.add(projektphase);
	}
	

}
