/**
 * 
 */
package ch.teko.projektverwaltung.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ch.teko.projektverwaltung.model.Projekt;

/**
 * @author Fabian
 *
 */
public class ProjektDAO implements BaseDAO<Projekt> {
	private EntityManagerFactory factory;
	private EntityManager entityManager;

	public ProjektDAO() {
		factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		entityManager = factory.createEntityManager();

	}

	@Override
	public Projekt getById(int id) {
		Projekt existingProjekt = entityManager.find(Projekt.class, id);
		return existingProjekt;
	}

	@Override
	public void save(Projekt projekt) {

		Projekt existingProjekt = entityManager.find(Projekt.class, projekt.getId());
		entityManager.getTransaction().begin();
		if (existingProjekt != null) {
			// update
			entityManager.merge(projekt);
		} else {
			// create
			entityManager.persist(projekt);
		}

		entityManager.flush();
		entityManager.getTransaction().commit();
	}

	@Override
	public void delete(Projekt projekt) {

		Projekt toDelete = entityManager.find(Projekt.class, projekt.getId());

		entityManager.getTransaction().begin();
		entityManager.remove(toDelete);
		entityManager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Projekt> getAll() {
		Query query = entityManager.createQuery("FROM Projekt");
		List<Projekt> projektList = (List<Projekt>) query.getResultList();
		return projektList;
	}

}
