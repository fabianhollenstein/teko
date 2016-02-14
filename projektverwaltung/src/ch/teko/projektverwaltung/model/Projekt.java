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
	
	
	@OneToMany
	private List<Projektphase> projektphasen;
	

}
