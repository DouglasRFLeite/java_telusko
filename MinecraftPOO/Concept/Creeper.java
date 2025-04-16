package Concept;

public class Creeper {
    int pontosDeVida = 5;
    int tempoParaExplodir = 4;
    boolean estaPerseguindoSteve = false;

    void andar() {
        System.out.println("O Creeper andou!");
    }

    void explodir() {
        pontosDeVida = 0;
        tempoParaExplodir = 0;
        System.out.println("O Creeper EXPLODIU!!");
    }
}
