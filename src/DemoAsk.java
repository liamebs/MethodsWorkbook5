import java.util.Scanner;

public class DemoAsk {
    // Main method
    public static void main(String[] args) {
        // request two variables using askMethod()
        System.out.println("I'll ask you for two numbers and add them together.\n");
        int a = askMethod();
        int b = askMethod();

        // call sumMethod() and pass above integers as arguments
        int c = sumMethod(a, b);
        // call display() and pass c as argument
        display(c);
    }

    // method asks for and returns whole number
    public static int askMethod() {
        Scanner integerAsk = new Scanner(System.in);
        System.out.println("Enter a whole number: ");

        // ensure input is valid
        // !integerAsk.hasNextInt() Scanner object returns true if integer is input
        while (!integerAsk.hasNextInt()) {
            System.out.println("Oops!  Try Again: ");
            integerAsk.next();
        }
        int reply = integerAsk.nextInt();
        return reply;
    }

    // method Returns the sum of two numbers, passed as parameters
    public static int sumMethod(int n, int m)
    // method not void so has to return something
    {

        int sum = n + m;
        return sum;
    }

    // method outputs the sum variable returned in sumMethod
    public static void display(int sum)
    // method doesn't return a value so is void
    {
        System.out.println("\nThe sum is = " + sum);
    }
}
