package ss_1.baitap;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Your weight (in kilogram):");
        weight = Integer.parseInt(sc.nextLine());

        System.out.print("Your height (in meter):");
        height = Integer.parseInt(sc.nextLine());
        bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
//giai thich %-20.2f%s la gi:
//Thành phần	Giải thích
//%	Bắt đầu một phần định dạng
//-	Căn trái (mặc định là căn phải)
//20	Chiều rộng tối thiểu của ô hiển thị là 20 ký tự
//.2	Lấy 2 chữ số sau dấu thập phân (áp dụng cho số thực)
//f	Định dạng kiểu float hoặc double
//%s	Định dạng chuỗi (string) ngay sau đó
