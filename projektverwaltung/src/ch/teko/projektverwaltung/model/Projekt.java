/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	private int priorität;
	private int status;
	private Date stardatumSoll;
	private Date enddatumSoll;
	private Date startdatumIst;
	private Date enddatumIst;
	private Mitarbeiter projektleiter;
	private Vorgehensmodell vorgehensmodell;
	private int projektfortschritt;
	//TODO links as Object (id, path)
	@OneToMany
	private List<Link> links;;
	
	
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


	public int getPriorität() {
		return priorität;
	}


	public void setPriorität(int priorität) {
		this.priorität = priorität;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public Date getStardatumSoll() {
		return stardatumSoll;
	}


	public void setStardatumSoll(Date stardatumSoll) {
		this.stardatumSoll = stardatumSoll;
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
