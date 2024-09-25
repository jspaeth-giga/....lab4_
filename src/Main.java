import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intOperandA;
        int intOperandB;
        int intSum;
        int intDifference;
        int intProduct;
        int intQuotient;
        int intModulo;

        double doubleOperandA;
        double doubleOperandB;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;
        double doubleModulo;

        System.out.println("What is your first number?");
        intOperandA = scan.nextInt();

        System.out.println("What is your second number?");
        intOperandB = scan.nextInt();

        intSum = intOperandA + intOperandB;
        System.out.println("The sum of your two numbers is " + intSum);

            intDifference = intOperandA - intOperandB;
        System.out.println("The difference of your two numbers is " + intDifference);

            intProduct = intOperandA * intOperandB;
        System.out.println("The product of your two numbers is " + intProduct);

            intQuotient = intOperandA/intOperandB;
        System.out.println("The quotient of your two numbers is " + intQuotient);

            intModulo = intOperandA % intOperandB;
        System.out.println("The modulo of your two numbers is " + intModulo);

        System.out.println("What is your first number?");
        doubleOperandA = scan.nextDouble();

        System.out.println("What is your second number?");
        doubleOperandB = scan.nextDouble();

            doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum of your two numbers is " + doubleSum);

            doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference of your two numbers is " + doubleDifference);

            doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product of your two numbers is " + doubleProduct);

            doubleQuotient = doubleOperandA/doubleOperandB;
        System.out.println("The quotient of your two numbers is " + doubleQuotient);

            doubleModulo = doubleOperandA % doubleOperandB;
        System.out.println("The modulo of your two numbers is " + doubleModulo);








    }
}