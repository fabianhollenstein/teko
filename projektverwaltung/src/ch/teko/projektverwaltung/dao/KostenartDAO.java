/**
 * 
 */
package ch.teko.projektverwaltung.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ch.teko.projektverwaltung.model.Kostenart;

/**
 * @author Fabian
 *
 */
public class KostenartDAO implements BaseDAO<Kostenart>{
	private EntityManagerFactory factory;
	private EntityManager entityManager;
	public KostenartDAO() {
		factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		entityManager = factory.createEntityManager();
	}

	@Override
	public Kostenart getById(int id) {
				
				Kostenart existingKostenart = entityManager.find(Kostenart.class, id);
				
				
				return existingKostenart;
	}

	@Override
	public void save(Kostenart kostenart) {
		
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
	
	}

	@Override
	public void delete(Kostenart kostenart) {
		
		
		
		Kostenart toDelete = entityManager.find(Kostenart.class, kostenart.getId());
		 
		entityManager.getTransaction().begin();
		entityManager.remove(toDelete);
		entityManager.getTransaction().commit();	
		
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
