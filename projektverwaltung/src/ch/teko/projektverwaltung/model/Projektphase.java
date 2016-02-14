package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Projektphase implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5452290220589104070L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
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
	
	
	private List<String> links;
	
	private List<Aktivitaet> aktivitaeten;
	
	private List<Meilenstein> meilensteine;



}
