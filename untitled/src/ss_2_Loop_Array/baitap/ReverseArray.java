package ss_2_Loop_Array.baitap;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        int [] oldArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nhap va phan tu thu " + i);
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mang truoc khi dao nguoc.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu "+ i + "= "+ arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            oldArr[i] = arr[(arr.length - i) - 1];
        }

        System.out.println("Mang sau khi dao nguoc.");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Phan tu thu "+ i + "= "+ oldArr[i]);
        }
    }
}
