/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Fabian
 *
 */
@Entity
public class PersonelleRessource implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8008109942734681248L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Funktion funktion;
	private BigDecimal kostenSoll;
	private BigDecimal kostenIst;
	private String abweichung;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public BigDecimal getKostenSoll() {
		return kostenSoll;
	}

	public void setKostenSoll(BigDecimal kostenSoll) {
		this.kostenSoll = kostenSoll;
	}

	public BigDecimal getKostenIst() {
		return kostenIst;
	}

	public void setKostenIst(BigDecimal kostenIst) {
		this.kostenIst = kostenIst;
	}

	public String getAbweichung() {
		return abweichung;
	}

	public void setAbweichung(String abweichung) {
		this.abweichung = abweichung;
	}

	public Funktion getFunktion() {
		return funktion;
	}

	public void setFunktion(Funktion funktion) {
		this.funktion = funktion;
	}

	

}
