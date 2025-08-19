/*WAP to print addition of 2 numbers (with Scanner) */
import java.util.Scanner;
public class Prog3_05_08_2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("Addition = " + sum);
    }
}


