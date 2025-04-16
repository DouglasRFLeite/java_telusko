package com.jdbc.spring_jdbc.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jdbc.spring_jdbc.model.Alien;

import lombok.Data;

@Repository
@Data
public class AlienRepository {

  private final Alien alien;

  @Autowired
  private JdbcTemplate template;

  AlienRepository(Alien alien) {
    this.alien = alien;
  }

  public void save(Alien alien) {
    template.update("insert into alien (id, name, tech) values (?, ?, ?)", alien.getId(), alien.getName(),
        alien.getTech());
    System.out.println("Added");
  }

  public List<Alien> findAll() {

    List<Alien> aliens = template.query("select * from alien",
        (resultSet, rowNum) -> {
          Alien a = new Alien();
          a.setId(resultSet.getInt(1));
          a.setName(resultSet.getString(2));
          a.setTech(resultSet.getString(3));

          return a;
        });
    return aliens;
  }
}
