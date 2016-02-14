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

	@Override
	public Funktion getById(int id) {
				EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
				EntityManager entityManager = factory.createEntityManager();
				
//				entityManager.refresh(entity);
				Funktion existingFunktion = entityManager.find(Funktion.class, id);
				
				//TODO close factory, close entityManager????
				return existingFunktion;
	}

	@Override
	public void save(Funktion funktion) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		
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
	public void delete(Funktion funktion) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		
		
		Funktion toDelete = entityManager.find(Funktion.class, funktion.getId());
		 
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
	public List<Funktion> getAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createQuery("FROM Funktion");
		List<Funktion> funktionList = (List<Funktion>) query.getResultList();
		return funktionList;
	}

}
