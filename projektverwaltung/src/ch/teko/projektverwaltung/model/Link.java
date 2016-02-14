/**
 * 
 */
package ch.teko.projektverwaltung.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Fabian
 *
 */
@Entity
public class Link implements Serializable{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String link;
}
