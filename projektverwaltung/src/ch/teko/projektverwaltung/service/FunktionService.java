package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.FunktionDAO;
import ch.teko.projektverwaltung.model.Funktion;
import ch.teko.projektverwaltung.model.Navigation;

@ManagedBean()
@RequestScoped
public class FunktionService {

	private FunktionDAO funktionDAO = new FunktionDAO();

	public String save(Funktion toSave) {
		funktionDAO.save(toSave);
		return Navigation.FUNKTION_VIEW;
	}
	
	public List<Funktion> getAll() {
		return funktionDAO.getAll();
	}
	
	public String delete(Funktion funktion) {
		funktionDAO.delete(funktion);
		return Navigation.FUNKTION_VIEW;
	}
	
	
}
