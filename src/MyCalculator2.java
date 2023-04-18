import java.util.Scanner; // import scanner class
public class MyCalculator2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the first number: "); // request double
        double num1 = Double.parseDouble(reader.nextLine());
        System.out.print("Enter the second number: "); // request another double
        double num2 = Double.parseDouble(reader.nextLine());

        while (true) {
            System.out.println("Which calculation would you like?\n");
            System.out.print("1. Add, 2. Subtract, 3. Multiply or 4. Divide? ");
            int reply = Integer.parseInt(reader.nextLine());
            if (reply == 1) {
                addNum(num1, num2);
            }
            if (reply == 2) {
                subtractNum(num1, num2);
            }
            if (reply == 3) {
                multiplyNum(num1, num2);
            }
            if (reply == 4) {
                divideNum(num1, num2);
            } else {
                break;
            }
        }

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

}

