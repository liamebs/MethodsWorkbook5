public class Fibonacci{

    public static void main(String[] args) {
        // call calculateFibonacci() method
        calculateFibonacci();
    }

    // define calculateFibonacci() method
    public static void calculateFibonacci() {
        long a = 0, b = 1; // initialise integers a and b
        System.out.println(a); // output initial values
        System.out.println(b);
        // call loopFibonacci() method with a, b  as arguments
        loopFibonacci(a, b);
    }

    // define loopFibonacci() method with a, b parameters
    public static void loopFibonacci(long a, long b) {
        int n = 50; // set upper limit for loop
        // initialise loop to not include first two iterations
        for (int i = 2; i <= n; i++) {
            // initialise local variable c for next long in sequence
            long c = a + b;
            a = b; // shift a, b along sequence for next iteration
            b = c;
            System.out.println(c); // output next number in sequence
        }
    }

}
