/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.util.Date;
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
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5648754785256529536L;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	private Date stardatumSoll;
	private Date enddatumSoll;
	private Date startdatumIst;
	private Date enddatumIst;
	private Mitarbeiter verantwortlichePerson;
	@OneToMany
	private List<PersonelleRessource> personelleResourcen;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the stardatumSoll
	 */
	public Date getStardatumSoll() {
		return stardatumSoll;
	}

	/**
	 * @param stardatumSoll the stardatumSoll to set
	 */
	public void setStardatumSoll(Date stardatumSoll) {
		this.stardatumSoll = stardatumSoll;
	}

	/**
	 * @return the enddatumSoll
	 */
	public Date getEnddatumSoll() {
		return enddatumSoll;
	}

	/**
	 * @param enddatumSoll the enddatumSoll to set
	 */
	public void setEnddatumSoll(Date enddatumSoll) {
		this.enddatumSoll = enddatumSoll;
	}

	/**
	 * @return the startdatumIst
	 */
	public Date getStartdatumIst() {
		return startdatumIst;
	}

	/**
	 * @param startdatumIst the startdatumIst to set
	 */
	public void setStartdatumIst(Date startdatumIst) {
		this.startdatumIst = startdatumIst;
	}

	/**
	 * @return the enddatumIst
	 */
	public Date getEnddatumIst() {
		return enddatumIst;
	}

	/**
	 * @param enddatumIst the enddatumIst to set
	 */
	public void setEnddatumIst(Date enddatumIst) {
		this.enddatumIst = enddatumIst;
	}

	/**
	 * @return the verantwortlichePerson
	 */
	public Mitarbeiter getVerantwortlichePerson() {
		return verantwortlichePerson;
	}

	/**
	 * @param verantwortlichePerson the verantwortlichePerson to set
	 */
	public void setVerantwortlichePerson(Mitarbeiter verantwortlichePerson) {
		this.verantwortlichePerson = verantwortlichePerson;
	}

	/**
	 * @return the personelleResourcen
	 */
	public List<PersonelleRessource> getPersonelleResourcen() {
		return personelleResourcen;
	}

	/**
	 * @param personelleResourcen the personelleResourcen to set
	 */
	public void setPersonelleResourcen(List<PersonelleRessource> personelleResourcen) {
		this.personelleResourcen = personelleResourcen;
	}

	/**
	 * @return the externeKosten
	 */
	public List<ExterneKosten> getExterneKosten() {
		return externeKosten;
	}

	/**
	 * @param externeKosten the externeKosten to set
	 */
	public void setExterneKosten(List<ExterneKosten> externeKosten) {
		this.externeKosten = externeKosten;
	}

	/**
	 * @return the aktivitaetsfortschritt
	 */
	public int getAktivitaetsfortschritt() {
		return aktivitaetsfortschritt;
	}

	/**
	 * @param aktivitaetsfortschritt the aktivitaetsfortschritt to set
	 */
	public void setAktivitaetsfortschritt(int aktivitaetsfortschritt) {
		this.aktivitaetsfortschritt = aktivitaetsfortschritt;
	}

	/**
	 * @return the links
	 */
	public List<Link> getLinks() {
		return links;
	}

	/**
	 * @param links the links to set
	 */
	public void setLinks(List<Link> links) {
		this.links = links;
	}

	@OneToMany
	private List<ExterneKosten> externeKosten;

	
	
	private int aktivitaetsfortschritt;
	
	@OneToMany
	private List<Link> links;
	

}
