package controlflow;

public class IfElse {
    private static String checkCondition(int number) {
        String result;
        if (number > 0) {
            result = "positive";
        } else if (number < 0) {
            result = "negative";
        } else {
            result = "zero";
        }
        return result;
    }

    public static void main(String[] args) {
        String ten = checkCondition(10); // positive
        String minusTen = checkCondition(-10); // negative
        String zero = checkCondition(0); // zero
    }
}
