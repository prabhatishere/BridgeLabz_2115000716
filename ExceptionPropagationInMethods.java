class Test8 {
    public static void print() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Handled exception in Main");
        }
    }


    public static void method1() {
        throw new ArithmeticException("Attempted to divide by zero");
    }


    public static void method2() {
        method1();
    }
}


public class ExceptionPropagationInMethods {
    public static void main(String[] args) {
        Test8.print();
    }
}


