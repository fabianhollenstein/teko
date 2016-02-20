package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.MitarbeiterDAO;
import ch.teko.projektverwaltung.dao.ProjektDAO;
import ch.teko.projektverwaltung.dao.VorgehensmodellDAO;
import ch.teko.projektverwaltung.model.FormProjekt;
import ch.teko.projektverwaltung.model.Mitarbeiter;
import ch.teko.projektverwaltung.model.Navigation;
import ch.teko.projektverwaltung.model.Projekt;
import ch.teko.projektverwaltung.model.Vorgehensmodell;

@ManagedBean()
@RequestScoped
public class ProjektService {

	private ProjektDAO projektDAO = new ProjektDAO();
	private MitarbeiterDAO mitarbeiterDAO = new MitarbeiterDAO();
	private VorgehensmodellDAO vorgehensmodellDAO = new VorgehensmodellDAO();

	public String save(FormProjekt formProjekt) {
		Projekt projekt = formProjekt.getProjekt();
		int mitarbeiterId = formProjekt.getMitarbeiterId();
		Mitarbeiter mitarbeiter = mitarbeiterDAO.getById(mitarbeiterId);
			if (mitarbeiter != null) {
				projekt.setProjektleiter(mitarbeiter);
			}
			int vorgehensmodellId = formProjekt.getVorgehensmodellId();	
		Vorgehensmodell vorgehensmodell = vorgehensmodellDAO.getById(vorgehensmodellId);
		if(vorgehensmodell != null) {
			projekt.setVorgehensmodell(vorgehensmodell);
		}
		
		//TODO add all Files to save in DB
		
		
		
		projektDAO.save(projekt);
		
		
		formProjekt.setProjekt(new Projekt());
		
		return Navigation.PROJEKT_VIEW;
	}
	
	public List<Projekt> getAll() {
		return projektDAO.getAll();
	}
	
	public String delete(Projekt projekt) {
		projektDAO.delete(projekt);
		return Navigation.PROJEKT_VIEW;
	}
	
	
}
