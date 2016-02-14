package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.FunktionDAO;
import ch.teko.projektverwaltung.model.Funktion;

@ManagedBean()
@RequestScoped
public class FunktionService {

	private FunktionDAO funktionDAO = new FunktionDAO();

	public void save(Funktion toSave) {
		funktionDAO.save(toSave);
	}
	
	public List<Funktion> getAll() {
		return funktionDAO.getAll();
	}
	
	public void delete(Funktion funktion) {
		funktionDAO.delete(funktion);
	}
	
	
}
