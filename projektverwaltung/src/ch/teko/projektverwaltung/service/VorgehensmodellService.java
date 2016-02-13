package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.VorgehensmodellDAO;
import ch.teko.projektverwaltung.model.Vorgehensmodell;

@ManagedBean()
@RequestScoped
public class VorgehensmodellService {

	private VorgehensmodellDAO vorgehensmodellDAO = new VorgehensmodellDAO();
	private Vorgehensmodell currentVorgehensmodell = new Vorgehensmodell();
	
	public Vorgehensmodell getCurrentVorgehensmodell() {
		return currentVorgehensmodell;
	}

	public void setCurrentVorgehensmodell(Vorgehensmodell currentVorgehensmodell) {
		this.currentVorgehensmodell = currentVorgehensmodell;
	}

	public void save(Vorgehensmodell toSave) {
		vorgehensmodellDAO.save(toSave);
	}
	
	public List<Vorgehensmodell> getAll() {
		return vorgehensmodellDAO.getAll();
	}
	
	
}
