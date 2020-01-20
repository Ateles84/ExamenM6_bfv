package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ex5 {

	private static EntityManagerFactory emf; // Declaramos los entity managers
	private static EntityManager manager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();

		manager.getTransaction().begin();

		// Como se aprecia tanto en el .sql como aqui, me he equivocado y el procedure
		// se llama "eliminia"Pringaos
		int i = manager.createNativeQuery("call eliminiaPringaos()").executeUpdate();

		if (i > 0)
			System.out.println(i > 1 ? "Se han eliminado " + i + " registros." : "Se ha eliminado un registro");

		manager.getTransaction().commit();

		manager.close();
	}
}
