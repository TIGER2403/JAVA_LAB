/*Write a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0. 
Read in a, b, c and use the quadratic formula.
If the discriminate b2-4ac is negative,
display a message stating that there are no real solutions. */
import java.util.Scanner;
public class Prog6_12_08_2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();
        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();
        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        double d = b * b - 4 * a * c;

        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Two real solutions: " + r1 + " and " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("One real solution: " + r);
        } else {
            System.out.println("No real solutions.");
        }
    }
}

