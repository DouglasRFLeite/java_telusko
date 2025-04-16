package operations;

public class LogicOperations {
    public static void main(String[] args) {
        boolean trueValue = true;
        boolean falseValue = false;

        // AND (&&) operations
        boolean andOperation = trueValue && trueValue; // true
        andOperation = trueValue && falseValue; // false
        andOperation = falseValue && trueValue; // false
        andOperation = falseValue && falseValue; // false

        // OR (||) operations
        boolean orOperation = trueValue || trueValue; // true
        orOperation = trueValue || falseValue; // true
        orOperation = falseValue || trueValue; // true
        orOperation = falseValue || falseValue; // false

        // NOT (!) operations
        boolean notOperation = !trueValue; // false
        notOperation = !falseValue; // true
    }
}
