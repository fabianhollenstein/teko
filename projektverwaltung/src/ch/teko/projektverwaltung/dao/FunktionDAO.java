/**
 * 
 */
package ch.teko.projektverwaltung.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ch.teko.projektverwaltung.model.Funktion;

/**
 * Verbindung Zur DB, hier werden die Queries abgesetzt
 * @author Fabian
 *
 */
public class FunktionDAO implements BaseDAO<Funktion> {

	EntityManagerFactory factory;
	EntityManager entityManager;

	public FunktionDAO() {
		factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		entityManager = factory.createEntityManager();
	}

	@Override
	public Funktion getById(int id) {
		Funktion existingFunktion = entityManager.find(Funktion.class, id);
		return existingFunktion;
	}

	@Override
	public void save(Funktion funktion) {

		Funktion existingFunktion = entityManager.find(Funktion.class, funktion.getId());
		entityManager.getTransaction().begin();
		if (existingFunktion != null) {
			// update
			entityManager.merge(funktion);

		} else {
			// create
			entityManager.persist(funktion);
		}

		entityManager.flush();
		entityManager.getTransaction().commit();

	}

	@Override
	public void delete(Funktion funktion) {
		Funktion toDelete = entityManager.find(Funktion.class, funktion.getId());
		entityManager.getTransaction().begin();
		entityManager.remove(toDelete);
		entityManager.getTransaction().commit();

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
