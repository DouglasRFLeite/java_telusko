public class Humano {

    private String corDosOlhos = "preto";
    private String roupa = "calça jeans";
    private String apelido;

    public Humano(String corDosOlhos, String roupa) {
        this.corDosOlhos = corDosOlhos;
        this.roupa = roupa;
    }

    private String senhaDoBanco;

    public String getCorDosOlhos() {
        return corDosOlhos;
    }

    public String getRoupa() {
        return roupa;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelidoDado) {
        if (apelidoDado == "professor") {
            apelido = apelidoDado;
        } else if (apelidoDado == "bobão") {
            System.out.println("Não gostei desse apelido!");
        }
    }
}