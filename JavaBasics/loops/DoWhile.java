package loops;

public class DoWhile {

    private static void doWhileCounter(int counter) {
        do {
            if (counter == 0) {
                System.out.println("Já é zero...");
            } else {
                System.out.println(counter + "...");
                counter--;
            }
        } while (counter > 0);
    }

    public static void main(String[] args) {
        doWhileCounter(3); // 3... 2... 1...
        doWhileCounter(0); // Já é zero...
    }
}
