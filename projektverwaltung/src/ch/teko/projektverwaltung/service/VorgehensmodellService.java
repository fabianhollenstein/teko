package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.VorgehensmodellDAO;
import ch.teko.projektverwaltung.model.FormVorgehensmodell;
import ch.teko.projektverwaltung.model.Navigation;
import ch.teko.projektverwaltung.model.Vorgehensmodell;

@ManagedBean()
@RequestScoped
public class VorgehensmodellService {

	private VorgehensmodellDAO vorgehensmodellDAO = new VorgehensmodellDAO();

	public String save(FormVorgehensmodell formVorgehensmodell) {
		vorgehensmodellDAO.save(formVorgehensmodell.getVorgehensmodell());
		
		formVorgehensmodell.setVorgehensmodell(new Vorgehensmodell());
		return Navigation.VORGEHENSMODELL_VIEW;
	}
	
	public List<Vorgehensmodell> getAll() {
		return vorgehensmodellDAO.getAll();
	}
	
	public String delete(Vorgehensmodell vorgehensmodell) {
		vorgehensmodellDAO.delete(vorgehensmodell);
		return Navigation.VORGEHENSMODELL_VIEW;
	}
	
	
}
