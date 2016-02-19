package ch.teko.projektverwaltung.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import ch.teko.projektverwaltung.dao.KostenartDAO;
import ch.teko.projektverwaltung.model.FormKostenart;
import ch.teko.projektverwaltung.model.Kostenart;
import ch.teko.projektverwaltung.model.Navigation;

@ManagedBean()
@RequestScoped
public class KostenartService {

	private KostenartDAO kostenartDAO = new KostenartDAO();

	public String save(FormKostenart formKostenart) {
		kostenartDAO.save(formKostenart.getKostenart());
		formKostenart.setKostenart(new Kostenart());
		
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
