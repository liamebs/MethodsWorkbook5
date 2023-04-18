import java.util.Scanner;
public class MinMaxMethod2 {
    public static void main(String[] args) {
        Scanner askInput = new Scanner(System.in); // instantiate  scanner object 'askInput'
        // request three numbers and declare as doubles
        System.out.println("Enter three numbers: ");
        double num1 = Double.parseDouble(askInput.next());
        double num2 = Double.parseDouble(askInput.next());
        double num3 = Double.parseDouble(askInput.next());

        // determine if all three numbers are integers
        if (num1 == (int) num1 && num2 == (int) num2 && num3 == (int) num3) {
            // if all are integers, temporarily convert to integers using (int) and call methods
            int min = calcMin((int) num1, (int) num2, (int) num3);
            int max = calcMax((int) num1, (int) num2, (int) num3);
            System.out.println("\nMinimum value = " + min);
            System.out.println("Maximum value = " + max);
        } else {
            // if any inputs are doubles, simply call methods
            double min = calcMin(num1, num2, num3);
            double max = calcMax(num1, num2, num3);
            System.out.println("\nMinimum value = " + min);
            System.out.println("Maximum value = " + max);
        }

    }

    // overload calcMin() and calcMax() using 'int' and 'double'

    public static int calcMin(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static double calcMin(double num1, double num2, double num3) {
        double[] array = {num1, num2, num3};
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int calcMax(int num1, int num2, int num3) {
        int[] array = {num1, num2, num3};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static double calcMax(double num1, double num2, double num3) {
        double[] array = {num1, num2, num3};
        double max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
