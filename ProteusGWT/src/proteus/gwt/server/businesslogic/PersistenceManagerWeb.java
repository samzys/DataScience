package proteus.gwt.server.businesslogic;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class PersistenceManagerWeb {

	public static final boolean DEBUG = true;
	private static final PersistenceManagerWeb singleton = new PersistenceManagerWeb();

	protected EntityManagerFactory emf;
	protected EntityManager em = null;

	public static PersistenceManagerWeb get() {
		return singleton;
	}

	private PersistenceManagerWeb() {
	}

	public EntityManager getEntityManager() {
		if (em == null || !em.isOpen()) {
			em = getEntityManagerFactory().createEntityManager();
		}
		// test em it before use
		try {
			Query query = em.createNativeQuery("SELECT 1");
			List qq = query.getResultList();
		} catch (Exception e) {
			if (em != null && em.isOpen())
				em.close();
			if (emf != null && emf.isOpen())
				emf.close();
			createEntityManagerFactory();
			em = getEntityManagerFactory().createEntityManager();
		}
		return em;
	}

	public EntityManagerFactory getEntityManagerFactory() {

		if (emf == null)
			createEntityManagerFactory();
		return emf;
	}

	public void closeEntityManagerFactory() {

		if (emf != null) {
			emf.close();
			emf = null;
			if (DEBUG)
				System.out.println("n*** Persistence finished at "
						+ new java.util.Date());
		}
	}

	protected void createEntityManagerFactory() {
		this.emf = Persistence.createEntityManagerFactory("ProteusWeb");
		if (DEBUG)
			System.out.println("n*** Persistence started at "
					+ new java.util.Date());
	}
}