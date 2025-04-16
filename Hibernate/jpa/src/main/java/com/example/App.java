package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        Alien a = new Alien(60, "Doug", "White");

        em.getTransaction().begin();
        em.persist(a);
        em.getTransaction().commit();
    }
}
