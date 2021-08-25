/**
 * Example from in class for taking input with the Scanner class.
 *
 * @author Mr. King
 * @version 8/25/2021
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        double area = base * height / 2.0;
        System.out.println("Area = " + area);
    }
}

