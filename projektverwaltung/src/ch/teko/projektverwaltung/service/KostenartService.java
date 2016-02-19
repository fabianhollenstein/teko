package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.KostenartDAO;
import ch.teko.projektverwaltung.model.Kostenart;
import ch.teko.projektverwaltung.model.Navigation;

@ManagedBean()
@RequestScoped
public class KostenartService {

	private KostenartDAO kostenartDAO = new KostenartDAO();

	public String save(Kostenart toSave) {
		kostenartDAO.save(toSave);
		return Navigation.KOSTENART_VIEW;
	}
	
	public List<Kostenart> getAll() {
		return kostenartDAO.getAll();
	}
	
	public String delete(Kostenart kostenart) {
		kostenartDAO.delete(kostenart);
		return Navigation.KOSTENART_VIEW;
	}
	
	
}
