package com.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public final class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure().addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Planet.class);
        ServiceRegistry registry = new StandardServiceRegistryBuilder() //
                .applySettings(configuration.getProperties())
                .build();
        SessionFactory sessionFactory = configuration.buildSessionFactory(registry);

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Alien a = session.load(Alien.class, 57);
        System.out.println(a);
        System.out.println(a.getColor());

        transaction.commit();
    }

}
