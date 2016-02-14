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
	
	private ExterneKosten externeKosten;

	
	
	private int aktivitaetsfortschritt;
	
	@OneToMany
	private List<Link> links;
	

}
