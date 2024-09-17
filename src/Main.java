public class Main {
    public static void main(String[] args) {
        int intOperandA = 1;
        int intOperandB = 3;
        int intSum = 5;
        int intProduct = 7;
        int intDifference = 9;
        int intQuotient = 11;
        int intModulo = 13;
        double doubleOperandA = 1.5;
        double doubleOperandB = 3.5;
        double doubleSum = 5.5;
        double doubleProduct = 7.5;
        double doubleDifference = 9.5;
        double doubleQuotient = 11.5;

        intSum = intOperandA + intOperandB;
        intProduct = intOperandA * intOperandB;
        intDifference = intOperandA - intOperandB;
        intQuotient = intOperandA / intOperandB;
        intModulo = intOperandA % intOperandB;

        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);
        System.out.println("The product of using ints " + intOperandA + " and " + intOperandB + " is " + intProduct);
        System.out.println("The difference of using ints " + intOperandA + " and " + intOperandB + " is " + intDifference);
        System.out.println("The quotient of using ints " + intOperandA + " and " + intOperandB + " is " + intQuotient);
        System.out.println("The modulo of using ints " + intOperandA + " and " + intOperandB + " is " + intModulo);
        }
    }