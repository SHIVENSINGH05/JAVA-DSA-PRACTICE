import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the position of the Fibonacci sequence: ");
        int n = scanner.nextInt();
        int result = fibonacci(n);
        System.out.println("Fibonacci number at position " + n + " is " + result);
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}