public class MethodMulti {
    static void myMethod() { // create myMethod() method
        System.out.println("I just got executed!");
        // ^ method content within curly braces
    }

    public static void main(String[] args) { // entry point of program
        myMethod(); // call myMethod() method three times
        myMethod();
        myMethod();
    }
}
