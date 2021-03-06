package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a*x+b=c',please enter constants:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = scanner.nextFloat();
        System.out.print("b: ");
        double b = scanner.nextFloat();
        System.out.print("c: ");
        double c = scanner.nextFloat();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Equation pass with x = " + x);
            System.out.printf("Equation pass with x = %f!\n", x);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
