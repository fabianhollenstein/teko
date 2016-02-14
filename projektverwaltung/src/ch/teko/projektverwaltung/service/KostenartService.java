package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.KostenartDAO;
import ch.teko.projektverwaltung.model.Kostenart;

@ManagedBean()
@RequestScoped
public class KostenartService {

	private KostenartDAO kostenartDAO = new KostenartDAO();

	public void save(Kostenart toSave) {
		kostenartDAO.save(toSave);
	}
	
	public List<Kostenart> getAll() {
		return kostenartDAO.getAll();
	}
	
	public void delete(Kostenart kostenart) {
		kostenartDAO.delete(kostenart);
	}
	
	
}
