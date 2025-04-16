package Concept;

public class MinecraftConcept {
    public static void main(String[] args) {
        System.out.println("O Jogo Iniciou...");

        Steve jogadorPrincipal = new Steve();

        jogadorPrincipal.andar();

        System.out.println("\nSteve encontrou uma árvore de Carvalho...");
        Arvore carvalho = new Arvore(TipoArvore.CARVALHO);
        carvalho.crescer();
        carvalho.crescer();
        carvalho.crescer();
        carvalho.crescer();

        System.out.println("\nSteve decidiu quebrar a árvore de Carvalho...");
        jogadorPrincipal.bater();
        carvalho.quebrar();
        jogadorPrincipal.bater();
        carvalho.quebrar();
        jogadorPrincipal.bater();
        carvalho.quebrar();

        System.out.println("\nSteve encontrou um Creeper...");
        jogadorPrincipal.andar();
        Creeper creeper = new Creeper();
        creeper.estaPerseguindoSteve = true;
        creeper.andar();

        System.out.println("\nSteve decidiu brigar com um Creeper...");
        jogadorPrincipal.bater();
        creeper.explodir();
    }
}

/*
 * O Jogo Iniciou...
 * Steve andou!
 * 
 * Steve encontrou uma árvore de Carvalho...
 * Árvore cresceu de 0 blocos para 1 blocos.
 * Árvore cresceu de 1 blocos para 2 blocos.
 * Árvore cresceu de 2 blocos para 3 blocos.
 * Árvore cresceu de 3 blocos para 4 blocos.
 * 
 * Steve decidiu quebrar a árvore de Carvalho...
 * Steve acertou algo.
 * Steve coletou uma madeira do tipo: CARVALHO
 * Steve acertou algo.
 * Steve coletou uma madeira do tipo: CARVALHO
 * Steve acertou algo.
 * Steve coletou uma madeira do tipo: CARVALHO
 * 
 * Steve encontrou um Creeper...
 * Steve andou!
 * O Creeper andou!
 * 
 * Steve decidiu brigar com um Creeper...
 * Steve acertou algo.
 * O Creeper EXPLODIU!!
 */
