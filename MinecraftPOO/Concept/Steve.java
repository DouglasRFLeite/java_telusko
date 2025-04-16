package Concept;

public class Steve {

    int pontosDeVida = 10;
    int pontosDeSaciedade = 10;
    Inventario inventario;

    void andar() {
        System.out.println("Steve andou!");
    }

    void comer() {
        pontosDeSaciedade = pontosDeSaciedade + 1;
        System.out.println("Steve comeu e recuperou 1 de vida.");
    }

    void bater() {
        System.out.println("Steve acertou algo.");
    }
}