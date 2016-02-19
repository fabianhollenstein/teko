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

import ch.teko.projektverwaltung.model.Funktion;

/**
 * @author Fabian
 *
 */
public class FunktionDAO implements BaseDAO<Funktion>{

	EntityManagerFactory factory;
	EntityManager entityManager;
	
	public FunktionDAO() {
		factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		entityManager = factory.createEntityManager();
	}
	@Override
	public Funktion getById(int id) {
				
//				entityManager.refresh(entity);
				Funktion existingFunktion = entityManager.find(Funktion.class, id);
				
				//TODO close factory, close entityManager????
				return existingFunktion;
	}

	@Override
	public void save(Funktion funktion) {
		
		Funktion existingFunktion = entityManager.find(Funktion.class, funktion.getId());
		entityManager.getTransaction().begin();
		if(existingFunktion != null) {
			//update
			entityManager.merge(funktion);
			
		} else {
			//create
			entityManager.persist(funktion);
		}
		
		entityManager.flush();
		entityManager.getTransaction().commit();
		

		
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	    try {
			ec.redirect(((HttpServletRequest) ec.getRequest()).getRequestURI());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
		
	}

	@Override
	public void delete(Funktion funktion) {
		
		
		
		Funktion toDelete = entityManager.find(Funktion.class, funktion.getId());
		 
		entityManager.getTransaction().begin();
		entityManager.remove(toDelete);
		entityManager.getTransaction().commit();
		
		
		
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
	public List<Funktion> getAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createQuery("FROM Funktion");
		List<Funktion> funktionList = (List<Funktion>) query.getResultList();
		return funktionList;
	}

}
