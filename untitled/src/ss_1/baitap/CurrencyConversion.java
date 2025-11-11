package ss_1.baitap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Nhpa vap so tien can quy doi: ");
        int monney = Integer.parseInt(sc.nextLine());
        double result = monney * 23000;
        System.out.println("Tien quy doi la: " + result + "VND");
    }
}
