package ch.teko.projektverwaltung.service;

import java.io.IOException;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import ch.teko.projektverwaltung.dao.FunktionDAO;
import ch.teko.projektverwaltung.dao.MitarbeiterDAO;
import ch.teko.projektverwaltung.model.FormMitarbeiter;
import ch.teko.projektverwaltung.model.Funktion;
import ch.teko.projektverwaltung.model.Mitarbeiter;
import ch.teko.projektverwaltung.model.Navigation;

@ManagedBean()
@RequestScoped
public class MitarbeiterService {

	private MitarbeiterDAO mitarbeiterDAO = new MitarbeiterDAO();
	private FunktionDAO funktionDAO = new FunktionDAO();

	public String save(FormMitarbeiter toSave) {
		Mitarbeiter mitarbeiter = toSave.getMitarbeiter();
		mitarbeiter.clearFunktion();
		String[] ids = toSave.getFunktionIds();
		for(int i = 0; i < ids.length; i++) {
			int id = Integer.parseInt(ids[i]);
			Funktion funktion = funktionDAO.getById(id);
			if (funktion != null) {
				mitarbeiter.addFunktion(funktion);
			}
			
		}
		
		
		mitarbeiterDAO.save(mitarbeiter);
		
		
		toSave.setMitarbeiter(new Mitarbeiter());
		
		return Navigation.MITARBEITER_VIEW;
	}
	
	public List<Mitarbeiter> getAll() {
		return mitarbeiterDAO.getAll();
	}
	
	public String delete(Mitarbeiter mitarbeiter) {
		mitarbeiterDAO.delete(mitarbeiter);
		
		return Navigation.MITARBEITER_VIEW;
	}
	
	
}
