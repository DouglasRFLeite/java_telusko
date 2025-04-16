package com.douglas.mvc_mvn;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "alien")
public class Alien {
  @Id
  private int id;
  private String name;
}
