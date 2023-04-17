public class Demo {
    // Main method
    public static void main(String[] args) {
        // initialise two integer variables
        int a = 4;
        int b = 6;

        // call sumMethod and pass above integers as arguments
        int c = sumMethod(a, b);
        // call display and pass c as argument
        display(c);
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
        System.out.println("This method prints the variable");
        System.out.println("The sum is = " + sum);
    }
}
