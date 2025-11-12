package ss_2_Loop_Array.baitap;

import java.util.Scanner;

public class Print20Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so luong SNT: ");
        int number = Integer.parseInt(sc.nextLine());
        int demSNT = 0;
        int demModSNT = 0;
        for (int i = 2; i <= 1000; i++) {
            demSNT = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    demSNT= demSNT + 1;
                }
            }
            if (demSNT == 2) {
                demModSNT++;
                System.out.println(i);
            }

            if (demModSNT == number) { // nếu đã đủ số lượng yêu cầu thì dừng
                break;
            }
        }
    }
}
