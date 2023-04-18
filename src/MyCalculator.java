import java.util.Scanner; // import scanner class
public class MyCalculator {
    public static void main(String[] args) {
        // call askNum() for each number
        double num1 = askNum();
        double num2 = askNum();

        // call respective methods to perform calculations
        addNum(num1, num2);
        subtractNum(num1, num2);
        multiplyNum(num1, num2);
        divideNum(num1, num2);

    }

    public static void addNum(double num1, double num2) {
        double add = num1 + num2;
        System.out.println("\n" + num1 + " + " + num2 + " = " + add);

    }

    public static void subtractNum(double num1, double num2) {
        double subtract = num1 - num2;
        System.out.println("\n" + num1 + " - " + num2 + " = " + subtract);

    }

    public static void multiplyNum(double num1, double num2) {
        double multiply = num1 * num2;
        System.out.println("\n" + num1 + " * " + num2 + " = " + multiply);

    }

    public static void divideNum(double num1, double num2) {
        double divide = num1 / num2;
        System.out.println("\n" + num1 + " / " + num2 + " = " + divide);

    }

    public static double askNum() { // initialise askInt() with an double return value
        Scanner scanner = new Scanner(System.in); // instantiate Scanner object "scanner"
        System.out.print("Enter a number: "); // request double
        while (!scanner.hasNextDouble()) { // create while loop to monitor input validity
            System.out.print("Invalid input!  Please enter a number: "); // request re-input
            scanner.nextLine(); // consume invalid input to prevent infinite loop
        }
        double num = scanner.nextDouble(); // once while loop is breached, assign valid input to num variable
        System.out.println("You entered: " + num); // print entry confirmation for user
        return num; // return double num
    }
}
