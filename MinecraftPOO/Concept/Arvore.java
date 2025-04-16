package Concept;

import java.util.ArrayList;
import java.util.List;

public class Arvore {
    List<BlocoDeMadeira> blocos = new ArrayList<>();
    TipoArvore tipoArvore;

    Arvore(TipoArvore tipoArvore) {
        this.tipoArvore = tipoArvore;
    }

    void crescer() {
        blocos.add(new BlocoDeMadeira(tipoArvore));
        System.out.println("Árvore cresceu de " + (blocos.size() - 1) + " blocos para " + blocos.size()
                + " blocos.");
    }

    void quebrar() {
        BlocoDeMadeira blocoQuebrado = blocos.remove(0);
        blocoQuebrado.quebrar();
    }
}
