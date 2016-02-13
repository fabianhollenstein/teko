package ch.teko.projektverwaltung.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.faces.event.AjaxBehaviorEvent;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Vorgehensmodell implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7467791973178762641L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	@OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Phase> phasen;
	
	public Vorgehensmodell() {
		phasen = new ArrayList<Phase>();

		phasen.add(new Phase());
	}
	
	
	public void setPhasen(List<Phase> listPhasen)
    {
        phasen = listPhasen;
    }

    public List<Phase> getPhasen()
    {
        return phasen;
    }

    public void onButtonRemoveFieldClick(final Phase phase)
    {
        phasen.remove(phase);
    }

    public void onButtonAddFieldClick(AjaxBehaviorEvent p_oEvent)
    {
    	
        phasen.add(new Phase());
    }


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}
}
