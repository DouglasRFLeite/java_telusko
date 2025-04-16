package com.douglas.mvc_boot;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AlienRepository extends JpaRepository<Alien, Integer> {

  // List<Alien> findByName(String name);

  @Query("from Alien where name like %:alienName%")
  List<Alien> findUsingTheName(@Param("alienName") String name);
}
