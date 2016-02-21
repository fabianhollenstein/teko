package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Projektphase implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5452290220589104070L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getReviewDatumSoll() {
		return reviewDatumSoll;
	}
	public void setReviewDatumSoll(Date reviewDatumSoll) {
		this.reviewDatumSoll = reviewDatumSoll;
	}
	public Date getReviewDatumIst() {
		return reviewDatumIst;
	}
	public void setReviewDatumIst(Date reviewDatumIst) {
		this.reviewDatumIst = reviewDatumIst;
	}
	public Date getFreigabedatum() {
		return freigabedatum;
	}
	public void setFreigabedatum(Date freigabedatum) {
		this.freigabedatum = freigabedatum;
	}
	public String getVisum() {
		return visum;
	}
	public void setVisum(String visum) {
		this.visum = visum;
	}
	public int getPhasenstatus() {
		return phasenstatus;
	}
	public void setPhasenstatus(int phasenstatus) {
		this.phasenstatus = phasenstatus;
	}
	public int getPhasenfortschritt() {
		return phasenfortschritt;
	}
	public void setPhasenfortschritt(int phasenfortschritt) {
		this.phasenfortschritt = phasenfortschritt;
	}
	public List<Aktivitaet> getAktivitaeten() {
		return aktivitaeten;
	}
	public void setAktivitaeten(List<Aktivitaet> aktivitaeten) {
		this.aktivitaeten = aktivitaeten;
	}
	public List<Meilenstein> getMeilensteine() {
		return meilensteine;
	}
	public void setMeilensteine(List<Meilenstein> meilensteine) {
		this.meilensteine = meilensteine;
	}
	private Date stardatumSoll;
	private Date enddatumSoll;
	private Date startdatumIst;
	private Date enddatumIst;
	
	private Date reviewDatumSoll;
	private Date reviewDatumIst;
	
	private Date freigabedatum;
	
	//TODO
	private String visum;
	
	private int phasenstatus;
	private int phasenfortschritt;
	
	
	//TODO links as Object (id, path)
//	private List<String> links;
	
	@OneToMany
	private List<Aktivitaet> aktivitaeten;
	@OneToMany
	private List<Meilenstein> meilensteine;



}
