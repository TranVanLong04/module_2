package ss_2_Loop_Array.baitap;

public class Print20PrimeSmaller100 {
    public static void main(String[] args) {
        int demSNT = 0;
        int count = 0;
        for (int i = 2; i <= 100; i++) {
            demSNT = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    demSNT= demSNT + 1;
                }
            }
            if (demSNT == 2) {
                System.out.println(i);
            }

            if (i == 100) { // nếu đã đủ số lượng yêu cầu thì dừng
                break;
            }
        }
    }
}
