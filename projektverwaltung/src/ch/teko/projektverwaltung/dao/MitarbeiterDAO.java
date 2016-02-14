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

import ch.teko.projektverwaltung.model.Mitarbeiter;

/**
 * @author Fabian
 *
 */
public class MitarbeiterDAO implements BaseDAO<Mitarbeiter>{

	@Override
	public Mitarbeiter getById(int id) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		
//		entityManager.refresh(entity);
		Mitarbeiter existingMitarbeiter = entityManager.find(Mitarbeiter.class, id);
		
		//TODO close factory, close entityManager????
		return existingMitarbeiter;
	}

	@Override
	public void save(Mitarbeiter mitarbeiter) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		
		Mitarbeiter existingMitarbeiter = entityManager.find(Mitarbeiter.class, mitarbeiter.getId());
		entityManager.getTransaction().begin();
		if(existingMitarbeiter != null) {
			//update
			entityManager.merge(existingMitarbeiter);
			
		} else {
			//create
			entityManager.persist(mitarbeiter);
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
	public void delete(Mitarbeiter mitarbeiter) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		
		
		Mitarbeiter toDelete = entityManager.find(Mitarbeiter.class, mitarbeiter.getId());
		 
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
	public List<Mitarbeiter> getAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createQuery("FROM Mitarbeiter");
		List<Mitarbeiter> mitarbeiterList = (List<Mitarbeiter>) query.getResultList();
		return mitarbeiterList;
	}

}
