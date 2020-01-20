package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class Ex4 {

	private static EntityManagerFactory emf; // Declaramos los entity managers
	private static EntityManager manager;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();

		//Como te he dicho, lo haria poniendo todos los objetos pero claro, los ids son ints, no objetos
		Bfplayer bfp = new Bfplayer("LolitoFDZ", 2, 10, 4, 10000, 0);
		// Creamos el player lolito fernandez, amb classe de suport (2), arma KE7 (10),
		// dispositivo ammo pouch (4) i un Kill/deaths de 10000/0
		
		manager.getTransaction().begin();
		
		manager.persist(bfp);
		
		manager.getTransaction().commit();
		
		manager.close();
		
	}

}
