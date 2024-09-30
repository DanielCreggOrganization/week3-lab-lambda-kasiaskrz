package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        // Using a lambda expression instead of implementing the interface via a class
        MathOperation addition = (a, b) -> a + b;

        System.out.println("Addition: " + addition.operate(5, 3));

        StringOperation toUpperCase = (a) -> a.toUpperCase();
        System.out.println("String: " + toUpperCase.apply("yes"));

        // Using a lambda expression
        Runnable task = () -> System.out.println("Hello from the thread");
        Thread thread = new Thread(task);
        thread.start();

        Calculator square = (int x) -> x * x;
        int result = square.calculate(5);
        System.out.println("Square of 5 is: " + result);

        

    }
}