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
	
	//TODO abweichung ist ja die abweichung zwischen  kosten sol/ist
	//jetzt braucht abe  die Abweichung noch einent Grund
	//erstelle Objekt Abweichung mit int abweichung und String begründung
	private String abweichung;
}
