public class MethodOverload {
    static int plusMethod(int x, int y) { // create integer plusMethod
        return x + y; // return sum of parameters
    }

    static double plusMethod(double x, double y) { // create double plusMethod
        return x + y; // return sum of parameters
    }

    public static void main(String[] args) {
        int myNum1 = plusMethod(8,5); // call plusMethod and assign to myNum1
        double myNum2 = plusMethod(4.3, 6.26); // call plusMethod and assign to MyNum2
        System.out.println("int: " + myNum1); // output myNum1
        System.out.println("double: " + myNum2); // output myNum2
    }
}
