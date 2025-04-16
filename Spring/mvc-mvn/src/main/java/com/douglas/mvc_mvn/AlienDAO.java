package com.douglas.mvc_mvn;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AlienDAO {

  @Autowired
  private SessionFactory sessionFactory;

  @Transactional
  public List<Alien> getAliens() {
    Session session = sessionFactory.getCurrentSession();
    return session.createQuery("from Alien", Alien.class).list();
  }

  @Transactional
  public void addAlien(Alien alien) {
    Session session = sessionFactory.getCurrentSession();
    session.save(alien);
  }

  @Transactional
  public Alien getAlien(int id) {
    Session session = sessionFactory.getCurrentSession();
    return session.get(Alien.class, id);
  }
}
