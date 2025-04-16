package controlflow;

public class Ternary {
    public static void main(String[] args) {
        String ten = (10 > 0) ? "positive" : "negative"; // positive
        String minusTen = (-10 > 0) ? "positive" : "negative"; // negative
        String zero = (0 == 0) ? "zero" : "non-zero"; // zero
    }
}
