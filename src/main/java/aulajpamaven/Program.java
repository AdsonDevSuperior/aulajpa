package aulajpamaven;

import aulajpamaven.dominio.Pessoa;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Program {

	public static void main(String[] args) {
		
	Pessoa p1 = new Pessoa(0, "Carlos da Silva", "carlos@gmail.com");
	Pessoa p2 = new Pessoa(0, "Joaquim Torres", "joaquim@gmail.com");
	Pessoa p3 = new Pessoa(0, "Ana Maria", "ana@gmail.com");
	
	EntityManagerFactory enf = Persistence.createEntityManagerFactory("exemplo-jpa");
	EntityManager em = enf.createEntityManager();
	em.getTransaction().begin();
	em.persist(p1);
	em.persist(p2);
	em.persist(p3);
	em.getTransaction().commit();
	System.out.println("Pronto!!!!!");
	
	}
}
