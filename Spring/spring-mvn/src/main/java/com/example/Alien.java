package com.example;

import lombok.Data;

@Data
public class Alien {
  private int age;
  private IComputer computer;

  public Alien() {
    System.out.println("Alien Object Created...");
  }

  public void code() {
    System.out.println("Coding...");
    computer.compile();
  }
}
