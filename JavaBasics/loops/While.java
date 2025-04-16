package loops;

public class While {
    public static void main(String[] args) {
        String phrase = "I'm smaller";

        while (!phrase.isEmpty()) {
            System.out.println(phrase);

            int lastCharIndex = phrase.length() - 1;
            phrase = phrase.substring(0, lastCharIndex);
        }
    }
}

/*
 * Output:
 * I'm smaller
 * I'm smalle
 * I'm small
 * I'm smal
 * I'm sma
 * I'm sm
 * I'm s
 * I'm
 * I'm
 * I'
 * I
 */