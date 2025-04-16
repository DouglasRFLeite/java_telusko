package com.telusko.junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SequenceTest {

    SequenceTest() {
        System.out.println("\nConstrutor - Antes de cada teste");
    }

    @BeforeAll
    static void antesDeTudo() {
        System.out.println("BeforeAll - Antes de todos os testes");
    }

    @BeforeEach
    void antesDeCada() {
        System.out.println("BeforeEach - Antes de cada teste");
    }

    @Test
    void test1() {
        System.out.println("Teste 1");
    }

    @Test
    void test2() {
        System.out.println("Teste 2");
    }

    @Test
    void test3() {
        System.out.println("Teste 3");
    }

    @AfterEach
    void depoisDeCada() {
        System.out.println("AfterEach - Depois de cada teste\n");
    }

    @AfterAll
    static void depoisDeTudo() {
        System.out.println("AfterAll - Depois de todos os testes");
    }

    /*
     * BeforeAll - Antes de todos os testes
     * 
     * Construtor - Antes de cada teste
     * BeforeEach - Antes de cada teste
     * Teste 1
     * AfterEach - Depois de cada teste
     * 2
     * 
     * Construtor - Antes de cada teste
     * BeforeEach - Antes de cada teste
     * Teste 2
     * AfterEach - Depois de cada teste
     * 2
     * 
     * Construtor - Antes de cada teste
     * BeforeEach - Antes de cada teste
     * Teste 3
     * AfterEach - Depois de cada teste
     * 
     * AfterAll - Depois de todos os testes
     */
}
