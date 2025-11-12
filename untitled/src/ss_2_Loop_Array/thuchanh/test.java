package ss_2_Loop_Array.thuchanh;

import java.lang.reflect.Array;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] numbers = {4,2,2,6,8};
        int [][] number1 = {{1,2,4,5,}, {43,5,6,7}};
        for(int i : numbers) {
            System.out.println(i);
        }
        //Hien thi nhanh mang bang toString
        System.out.println(Arrays.toString(numbers));
        //HIen thi mang 2 chieu nhahh bang deepToString
        System.out.println(Arrays.deepToString(number1));
    }
}
