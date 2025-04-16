package com.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Alien {
  @Id
  private int aid;
  private String aname;
  private String color;
}
