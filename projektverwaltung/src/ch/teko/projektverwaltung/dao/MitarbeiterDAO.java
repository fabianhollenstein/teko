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
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	public MitarbeiterDAO() {
		factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		entityManager = factory.createEntityManager();
		
	}
	@Override
	public Mitarbeiter getById(int id) {
		// TODO Auto-generated method stub
		
		
//		entityManager.refresh(entity);
		Mitarbeiter existingMitarbeiter = entityManager.find(Mitarbeiter.class, id);
		
		//TODO close factory, close entityManager????
		return existingMitarbeiter;
	}

	@Override
	public void save(Mitarbeiter mitarbeiter) {
	
		Mitarbeiter existingMitarbeiter = entityManager.find(Mitarbeiter.class, mitarbeiter.getId());
		entityManager.getTransaction().begin();
		if(existingMitarbeiter != null) {
			//update
			entityManager.merge(mitarbeiter);
			
		} else {
			//create
			entityManager.persist(mitarbeiter);
		}
		
		entityManager.flush();
		entityManager.getTransaction().commit();
			
		
	}

	@Override
	public void delete(Mitarbeiter mitarbeiter) {
	
		Mitarbeiter toDelete = entityManager.find(Mitarbeiter.class, mitarbeiter.getId());
		 
		entityManager.getTransaction().begin();
		entityManager.remove(toDelete);
		entityManager.getTransaction().commit();
		
		
	

		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mitarbeiter> getAll() {
		
		Query query = entityManager.createQuery("FROM Mitarbeiter");
		List<Mitarbeiter> mitarbeiterList = (List<Mitarbeiter>) query.getResultList();
		return mitarbeiterList;
	}

}
