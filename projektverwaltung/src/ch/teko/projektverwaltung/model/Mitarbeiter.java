/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 * @author Fabian
 *
 */
@Entity
public class Mitarbeiter implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8312154335799242637L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int personalNummer;
	private String name;
	private String vorname;
	private String abteilung;
	private String arbeitspensum;
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	//private List<Funktion> funktionen = new ArrayList<Funktion>();
	private Set<Funktion> funktionen = new HashSet<Funktion>();
	
	
	public Mitarbeiter() {

		// funktionen.add(new Funktion());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPersonalNummer() {
		return personalNummer;
	}

	public void setPersonalNummer(int personalNummer) {
		this.personalNummer = personalNummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getAbteilung() {
		return abteilung;
	}

	public void setAbteilung(String abteilung) {
		this.abteilung = abteilung;
	}

	public String getArbeitspensum() {
		return arbeitspensum;
	}

	public void setArbeitspensum(String arbeitspensum) {
		this.arbeitspensum = arbeitspensum;
	}

	public Set<Funktion> getFunktionen() {
		return funktionen ;
	}

	

	public void addFunktion(Funktion funktion) {
		funktionen.add(funktion);
		

	}

	public void clearFunktion() {
		funktionen.clear();
	}
}
