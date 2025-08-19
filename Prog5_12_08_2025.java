/*WAP that reads a number in meters converts it to feet and displays the result */

import java.util.Scanner;

public class Prog5_12_08_2025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length in meters: ");
        double meters = sc.nextDouble();

        double feet = meters * 3.28084;

        System.out.println(meters + " meters = " + feet + " feet");
    }
}
    
