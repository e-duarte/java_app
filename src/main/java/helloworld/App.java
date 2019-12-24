package helloworld;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {
        EntityManager manager = Persistence.createEntityManagerFactory("teste").createEntityManager();
        Usuario u = new Usuario();
        u.setUsername("eduarte");
        u.setPassword("admin");

        manager.getTransaction().begin();
        manager.persist(u);
        manager.getTransaction().commit();
        System.out.println(u);
    }
}
