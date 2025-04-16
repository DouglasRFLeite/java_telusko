public class StaticBlock {
    static int VALOR = 12;

    static {
        VALOR = VALOR * 2;
        System.out.println("No bloco");
    }

    StaticBlock() {
        System.out.println("No construtor");
        VALOR = VALOR * 2;
    }
}
