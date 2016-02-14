/**
 * 
 */
package ch.teko.projektverwaltung.dao;

import java.io.IOException;
import java.util.List;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;

import ch.teko.projektverwaltung.model.Kostenart;

/**
 * @author Fabian
 *
 */
public class KostenartDAO implements BaseDAO<Kostenart>{

	@Override
	public Kostenart getById(int id) {
				EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
				EntityManager entityManager = factory.createEntityManager();
				
//				entityManager.refresh(entity);
				Kostenart existingKostenart = entityManager.find(Kostenart.class, id);
				
				//TODO close factory, close entityManager????
				return existingKostenart;
	}

	@Override
	public void save(Kostenart kostenart) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		
		Kostenart existingKostenart = entityManager.find(Kostenart.class, kostenart.getId());
		entityManager.getTransaction().begin();
		if(existingKostenart != null) {
			//update
			entityManager.merge(kostenart);
			
		} else {
			//create
			entityManager.persist(kostenart);
		}
		
		entityManager.flush();
		entityManager.getTransaction().commit();
		

		entityManager.close();
		factory.close();
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	    try {
			ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}

	@Override
	public void delete(Kostenart kostenart) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		
		
		Kostenart toDelete = entityManager.find(Kostenart.class, kostenart.getId());
		 
		entityManager.getTransaction().begin();
		entityManager.remove(toDelete);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		factory.close();
		
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	    try {
			ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Kostenart> getAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createQuery("FROM Kostenart");
		List<Kostenart> funktionList = (List<Kostenart>) query.getResultList();
		return funktionList;
	}

}
