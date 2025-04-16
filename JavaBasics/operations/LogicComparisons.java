package operations;

public class LogicComparisons {
    public static void main(String[] args) {
        int big = 10;
        int small = 1;
        int equal = 1;

        boolean greaterThan = small > big; // false
        greaterThan = big > small; // true
        greaterThan = small > equal; // false

        boolean lesserThan = small < big; // true
        lesserThan = big < small; // false
        lesserThan = small < equal; // false

        boolean equals = small == big; // false
        equals = small == equal; // true

        boolean different = small != big; // true
        different = small != equal; // false

        boolean greaterOrEqual = small >= big; // false
        greaterOrEqual = big >= small; // true
        greaterOrEqual = small >= equal; // true

        boolean lesserOrEqual = small <= big; // true
        lesserOrEqual = big <= small; // false
        lesserOrEqual = small <= equal; // true
    }
}
