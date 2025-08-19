/*Write a program for fabonacci series
 */
import java.util.Scanner;

public class Prog7_19_08_2025{
    // Recursive function
    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms: ");
        int n = sc.nextInt();

        // Non-Recursive (loop)
        int a = 0, b = 1;
        System.out.print("Fibonacci Series (Non-Recursive): ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

        System.out.println();

        // Recursive
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
