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

import ch.teko.projektverwaltung.model.Vorgehensmodell;

public class VorgehensmodellDAO  {
	public void save(Vorgehensmodell vorgehensmodell) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		
//		entityManager.refresh(entity);
		Vorgehensmodell existingVorgehensmodell = entityManager.find(Vorgehensmodell.class, vorgehensmodell.getId());
		entityManager.getTransaction().begin();
		if(existingVorgehensmodell != null) {
			//update
//			entityManager.close();
//			entityManager = factory.createEntityManager();
//			entityManager.getTransaction().begin();
			Vorgehensmodell model = entityManager.merge(vorgehensmodell);
			
		} else {
			
			//create
			entityManager.persist(vorgehensmodell);
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

	@SuppressWarnings("unchecked")
	public List<Vorgehensmodell> getAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
		Query query = entityManager.createQuery("FROM Vorgehensmodell");
		List<Vorgehensmodell> vorgehensmodellList = (List<Vorgehensmodell>) query.getResultList();
		return vorgehensmodellList;
		
	}

	public void delete(Vorgehensmodell vorgehensmodell) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		EntityManager entityManager = factory.createEntityManager();
//		entityManager.remove(vorgehensmodell);
//		Query query = entityManager.createQuery("DELETE Vorgehensmodell where id = :id");
//		query.setParameter("id", vorgehensmodell);
		
		
		Vorgehensmodell toDelete = entityManager.find(Vorgehensmodell.class, vorgehensmodell.getId());
		 
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


}