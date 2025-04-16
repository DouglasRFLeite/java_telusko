package com.example;

public class Desktop implements IComputer {
  @Override
  public void compile() {
    System.out.println("Compiling on Desktop...");
  }
}