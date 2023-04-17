import java.util.Scanner; // import scanner class
public class MinMaxMethods {
    public static void main(String[] args) {
        // call askInt() method for three integers:
        int num1 = askInt();
        int num2 = askInt();
        int num3 = askInt();

        // populate integer array with these numbers:
        int[] array = {num1, num2, num3};

        minCalc(array); // call minCalc() with int array
        maxCalc(array); // call maxCalc() with int array
    }

    public static void minCalc(int[] array) { // initialise minCalc() with no return value
        int min = array[0]; // initialise min (wih appropriate scope) to equal first element of array
        for (int i = 1; i < array.length; i++) { // iterate through array, starting with second element
            if (array[i] < min) {
                min = array[i]; // update min if element is less than that currently stored
            }
        }
        System.out.println("\nThe smallest number is: " + min); // print min
    }

    public static void maxCalc(int[] array) { // initialise maxCalc() with no return value
        int max = array[0]; // initialise max (wih appropriate scope) to equal first element of array
        for (int i = 1; i < array.length; i++) { // iterate through array, starting with second element
            if (array[i] > max) {
                max = array[i]; // update max if element is more than that currently stored
            }
        }
        System.out.println("\nThe largest number is: " + max); // print max
    }

    public static int askInt() { // initialise askInt() with an integer return value
        Scanner scanner = new Scanner(System.in); // instantiate Scanner object "scanner"
        System.out.print("Enter a whole number: "); // request integer
        while (!scanner.hasNextInt()) { // create while loop to monitor input validity
            System.out.print("Invalid input!  Please enter a whole number: "); // request re-input
            scanner.nextLine(); // consume invalid input to prevent infinite loop
        }
        int num = scanner.nextInt(); // once while loop is breached, assign valid input to num variable
        System.out.println("You entered: " + num); // print entry confirmation for user
        return num; // return integer num
    }

}
