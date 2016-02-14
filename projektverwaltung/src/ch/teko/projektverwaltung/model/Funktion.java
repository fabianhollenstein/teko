package ch.teko.projektverwaltung.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funktion implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5452290220589104070L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	public int getId() {
		return id;
	}

	private String name;
	

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    

}
