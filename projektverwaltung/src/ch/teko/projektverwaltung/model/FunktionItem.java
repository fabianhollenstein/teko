package ch.teko.projektverwaltung.model;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class FunktionItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5452290220589104070L;


	public Funktion funktion;
	

    public void setFunktion(Funktion funktion)
    {
        this.funktion = funktion;
    }

    public Funktion getFunktion()
    {
        return funktion;
    }
    

}
