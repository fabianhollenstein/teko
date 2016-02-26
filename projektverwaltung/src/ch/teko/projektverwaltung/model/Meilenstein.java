package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Model Klasse
 * @author Fabian
 *
 */
@Entity
public class Meilenstein implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5452290220589104070L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private Date datum;
	private String name;
	
	public int getId() {
		return id;
	}

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}
    

}
