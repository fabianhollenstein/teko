package ch.teko.projektverwaltung.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ch.teko.projektverwaltung.model.Vorgehensmodell;
/**
 * Verbindung Zur DB, hier werden die Queries abgesetzt
 * @author Fabian
 *
 */
public class VorgehensmodellDAO implements BaseDAO<Vorgehensmodell> {
	private EntityManagerFactory factory;
	private EntityManager entityManager;

	public VorgehensmodellDAO() {
		factory = Persistence.createEntityManagerFactory("ProjektverwaltungEntityManager");
		entityManager = factory.createEntityManager();
	}

	public void save(Vorgehensmodell vorgehensmodell) {

		Vorgehensmodell existingVorgehensmodell = entityManager.find(Vorgehensmodell.class, vorgehensmodell.getId());
		entityManager.getTransaction().begin();
		if (existingVorgehensmodell != null) {
			// update
			entityManager.merge(vorgehensmodell);

		} else {
			// create
			entityManager.persist(vorgehensmodell);
		}

		entityManager.flush();
		entityManager.getTransaction().commit();

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
		Vorgehensmodell toDelete = entityManager.find(Vorgehensmodell.class, vorgehensmodell.getId());

		entityManager.getTransaction().begin();
		entityManager.remove(toDelete);
		entityManager.getTransaction().commit();
	}

	@Override
	public Vorgehensmodell getById(int id) {
		Vorgehensmodell existingVorgehensmodell = entityManager.find(Vorgehensmodell.class, id);
		return existingVorgehensmodell;
	}

}