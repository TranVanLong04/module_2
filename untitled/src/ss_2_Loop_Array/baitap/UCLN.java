package ss_2_Loop_Array.baitap;

import java.util.Scanner;

//SU dung thuat toan Euclid de tim UCLN bang cach lay numberA % numberB
public class UCLN {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int numberA = Integer.parseInt(sc.nextLine());
        int numberB = Integer.parseInt(sc.nextLine());
        int temp = numberB;
        while (numberB!=0) {
            temp = numberA%numberB;
            numberA = numberB;
            numberB = temp;
        }
        System.out.println("UCLN: " + numberA);
    }
}
