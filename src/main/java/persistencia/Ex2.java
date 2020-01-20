package persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class Ex2 {

	private static EntityManagerFactory emf;	//Declaramos los entity managers
	private static EntityManager manager;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("persistencia");
		manager = emf.createEntityManager();

		manager.getTransaction().begin();

		//recogemos todos los jugadores
		@SuppressWarnings("unchecked")
		List<Bfplayer> l = manager.createNativeQuery("select * from Bfplayer", Bfplayer.class).getResultList();
		
		manager.close();
		
		for (Bfplayer bfp: l) {
			System.out.println("Kill/Death ratio de: " + bfp.getUserId() + " - " + bfp.getKills() + "/" + bfp.getDeads());
		}
	
	}

}
