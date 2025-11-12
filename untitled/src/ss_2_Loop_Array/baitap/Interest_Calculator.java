package ss_2_Loop_Array.baitap;

import java.util.Scanner;

public class Interest_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số lượng tiền cho vay: ");
        long moneys = Long.parseLong(sc.nextLine());
        System.out.println("Tỉ lệ lãi suất theo tháng: ");
        double interestRate = Double.parseDouble(sc.nextLine());
        System.out.println("Số tháng cho vay: ");
        int month = Integer.parseInt(sc.nextLine());

        double totalOfInterest = 0;
        for(int i = 0; i < month; i++){
            totalOfInterest += moneys * (interestRate/100)/12 * month;
        }
        System.out.println("Tổng số tiền có được khi hết thời hạn cho vay: " + totalOfInterest);
    }
}
