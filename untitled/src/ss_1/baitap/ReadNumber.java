package ss_1.baitap;

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số (0 - 999): ");
        int number = Integer.parseInt(sc.nextLine());

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
            return;
        }

        String result = readNumber(number);
        System.out.println(result);
    }

    public static String readNumber(int number) {
        if (number < 10) {
            return readOneDigit(number);
        } else if (number < 20) {
            return readTeen(number);
        } else if (number < 100) {
            return readTwoDigits(number);
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;
            String result = readOneDigit(hundreds) + " hundred";
            if (remainder != 0) {
                result += " and " + readNumber(remainder);
            }
            return result;
        }
    }

    public static String readOneDigit(int n) {
        switch (n) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String readTeen(int n) {
        switch (n) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static String readTwoDigits(int n) {
        int tens = n / 10;
        int ones = n % 10;
        String tensWord = "";

        switch (tens) {
            case 2: tensWord = "twenty"; break;
            case 3: tensWord = "thirty"; break;
            case 4: tensWord = "forty"; break;
            case 5: tensWord = "fifty"; break;
            case 6: tensWord = "sixty"; break;
            case 7: tensWord = "seventy"; break;
            case 8: tensWord = "eighty"; break;
            case 9: tensWord = "ninety"; break;
        }

        if (ones != 0) {
            return tensWord + " " + readOneDigit(ones);
        } else {
            return tensWord;
        }
    }
}
