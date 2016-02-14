package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.MitarbeiterDAO;
import ch.teko.projektverwaltung.model.Mitarbeiter;

@ManagedBean()
@RequestScoped
public class MitarbeiterService {

	private MitarbeiterDAO mitarbeiterDAO = new MitarbeiterDAO();
	//private Vorgehensmodell currentVorgehensmodell = new Vorgehensmodell();
	
//	public Vorgehensmodell getCurrentVorgehensmodell() {
//		return currentVorgehensmodell;
//	}
//
//	public void setCurrentVorgehensmodell(Vorgehensmodell currentVorgehensmodell) {
//		this.currentVorgehensmodell = currentVorgehensmodell;
//	}

	public void save(Mitarbeiter toSave) {
		mitarbeiterDAO.save(toSave);
	}
	
	public List<Mitarbeiter> getAll() {
		return mitarbeiterDAO.getAll();
	}
	
	public void delete(Mitarbeiter mitarbeiter) {
		mitarbeiterDAO.delete(mitarbeiter	);
	}
	
	
}
