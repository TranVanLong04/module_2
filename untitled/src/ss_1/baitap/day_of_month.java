package ss_1.baitap;

import java.util.Scanner;

public class day_of_month {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Nhap vao thang can tinh ngay: ");
        byte month = Byte.parseByte(sc.nextLine());
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("Thang "+ month + "co 31 ngay!");
                break;
            case 4, 6, 9, 11:
                System.out.println("Thang " + month + "co 30 ngay!");
                break;
            case 2:
                System.out.println("Thang co 29 ngay!");
                break;
        }
    }
}
