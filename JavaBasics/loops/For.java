package loops;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("Comente " + i + " vezes!");
        }
        /*
         * Comente 1 vezes!
         * Comente 2 vezes!
         * Comente 3 vezes!
         * Comente 4 vezes!
         */

        for (int i = 4; i > 0; i--) {
            System.out.println("Comente " + i + " vezes!");
        }
        /*
         * Comente 4 vezes!
         * Comente 3 vezes!
         * Comente 2 vezes!
         * Comente 1 vezes!
         */
    }
}
