package Concept;

public class BlocoDeMadeira {
    TipoArvore tipoArvore;

    BlocoDeMadeira(TipoArvore tipoArvore) {
        this.tipoArvore = tipoArvore;
    }

    void quebrar() {
        System.out.println("Steve coletou uma madeira do tipo: " + tipoArvore);
    }
}
