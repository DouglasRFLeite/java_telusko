package com.example;

public class Laptop implements IComputer {
  @Override
  public void compile() {
    System.out.println("Compiling on Laptop...");
  }
}
