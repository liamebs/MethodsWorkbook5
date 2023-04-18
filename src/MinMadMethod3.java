import java.util.Scanner;
public class MinMadMethod3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // instantiate scanner object 'reader'
        // request three numbers and declare as doubles
        System.out.println("Enter three numbers: ");
        int num1 = Integer.parseInt(reader.next());
        int num2 = Integer.parseInt(reader.next());
        int num3 = Integer.parseInt(reader.next());

        int max = maxCalc(num1, num2, num3);
        int min = minCalc(num1, num2, num3);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
    public static int maxCalc(int num1, int num2, int num3) {
        if (num2 > num1 && num2 > num3) {
            return num2;
        }
        else if (num1 > num2 && num1 > num3) {
            return num1;
        }
        else {
            return num3;
        }

    }

    public static int minCalc(int num1, int num2, int num3) {
        if (num2 < num1 && num2 < num3) {
            return num2;
        }
        else if (num1 < num2 && num1 < num3) {
            return num1;
        } else {
            return num3;
        }
    }





}
