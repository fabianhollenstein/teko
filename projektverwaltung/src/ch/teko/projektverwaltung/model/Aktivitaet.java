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

/**
 * @author Fabian
 *
 */
@Entity
public class Aktivitaet implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private Date stardatumSoll;
	private Date enddatumSoll;
	private Date startdatumIst;
	private Date enddatumIst;
	private Mitarbeiter verantwortlichePerson;
	private PersonelleRessource personelleResource;
	
	
	
	//TODO das sind externe Kosten
	private ExterneKosten externeKosten;
//	private int budgetSoll;
//	private int budgetIst;
	
	
	private int aktivitaetsfortschritt;
	private List<String> links;
	

}
