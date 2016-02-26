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
public class ExterneKosten implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8312154335799242637L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private Kostenart kostenart;
	private BigDecimal kostenSoll;
	private BigDecimal kostenIst;
	

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
	 * @return the kostenart
	 */
	public Kostenart getKostenart() {
		return kostenart;
	}


	/**
	 * @param kostenart the kostenart to set
	 */
	public void setKostenart(Kostenart kostenart) {
		this.kostenart = kostenart;
	}


	/**
	 * @return the kostenSoll
	 */
	public BigDecimal getKostenSoll() {
		return kostenSoll;
	}


	/**
	 * @param kostenSoll the kostenSoll to set
	 */
	public void setKostenSoll(BigDecimal kostenSoll) {
		this.kostenSoll = kostenSoll;
	}


	/**
	 * @return the kostenIst
	 */
	public BigDecimal getKostenIst() {
		return kostenIst;
	}


	/**
	 * @param kostenIst the kostenIst to set
	 */
	public void setKostenIst(BigDecimal kostenIst) {
		this.kostenIst = kostenIst;
	}


	/**
	 * @return the abweichung
	 */
	public String getAbweichung() {
		return abweichung;
	}


	/**
	 * @param abweichung the abweichung to set
	 */
	public void setAbweichung(String abweichung) {
		this.abweichung = abweichung;
	}


	private String abweichung;
}
