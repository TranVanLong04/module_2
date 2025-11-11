package ss_1.baitap;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        System.out.print("a: ");
        double a = Double.parseDouble(sc.nextLine());

        System.out.print("b: ");
        double b = Double.parseDouble(sc.nextLine());

        System.out.print("c: ");
        double c = Double.parseDouble(sc.nextLine());
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
