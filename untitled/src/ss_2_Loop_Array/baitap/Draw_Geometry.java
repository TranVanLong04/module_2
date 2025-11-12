package ss_2_Loop_Array.baitap;

import java.util.Scanner;

public class Draw_Geometry {
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("1. Draw the square");
        System.out.println("2. Draw the triangle");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        byte choice = Byte.parseByte(sc.nextLine());
        switch (choice) {
            case 1:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 5; i > 0; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
    }
}
