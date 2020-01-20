package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import clases.*;

public class Ex3 {

	private static EntityManagerFactory emf;	//Declaramos los entity managers
	private static EntityManager manager;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		emf = Persistence.createEntityManagerFactory("persistencia");	
		manager = emf.createEntityManager();
		
		WeaponId KE7 = new WeaponId(10, "KE7", "Light Machine Gun", 23, 65 );	//Declaracion del arma
	
		Weapon arma = new Weapon(KE7);	//Lo asignamos a su clase ya que la reveng nos las separa
		
		manager.getTransaction().begin();	//Transaccion tipica
		
		manager.persist(arma);
		
		manager.getTransaction().commit();
		
		manager.close();
		
	}

}
