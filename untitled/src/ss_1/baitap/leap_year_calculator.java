package ss_1.baitap;

import java.util.Scanner;

public class leap_year_calculator {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Nhap vao nam can tinh: ");
        int year = Integer.parseInt(sc.nextLine());
        if(year % 4 == 0) {
            if (year % 100 != 0) {
                System.out.println("Nam nhuan!");
            }
            else {
                if (year % 400 != 0) {
                    System.out.println("Khong phai nam nhuan!");
                }
                else{
                    System.out.println("Nam nhuan!");
                }
            }
        }
        else {
            System.out.println("Khong phai nam nhuan!");
        }
    }
}
