package ss01_Introduction_To_Java.Bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can doc: ");
        int inputNum = scanner.nextInt();
        if (inputNum >= 0 && inputNum < 10) {
            System.out.println(num(inputNum));
        } else if (inputNum < 100) {
            System.out.println(twoNum(inputNum));
        } else {
            System.out.println(threeNum(inputNum));
        }

    }

    public static String num(int inputNum) {
        switch (inputNum) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "sever";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
        }
        return "zero";
    }

    public static String twoNum(int num) {
        String result = "";
        if (num < 20) {
            switch (num) {
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
            }
        } else {
            int tens = num / 10;
            int ones = num % 10;
            switch (tens) {
                case 2:
                    result = "twenty";
                    break;
                case 3:
                    result = "thirty ";
                    break;
                case 4:
                    result = "forty ";
                    break;
                case 5:
                    result = "fifty ";
                    break;
                case 6:
                    result = "sixty ";
                    break;
                case 7:
                    result = "seventy ";
                    break;
                case 8:
                    result = "eighty ";
                    break;
                case 9:
                    result = "ninety ";
                    break;
            }
            if (ones != 0) {
                result += num(ones);
            }
        }
        return result;
    }

    public static String threeNum(int num) {
        String result = "";

        int hundred = num / 100;
        int other = num - (hundred * 100);
        if (other != 0) {
            switch (hundred) {
                case 1:
                    result = "One hundred and ";
                    break;
                case 2:
                    result = "Two hundred and ";
                    break;
                case 3:
                    result = "Three hundred and ";
                    break;
                case 4:
                    result = "Four hundred and ";
                    break;
                case 5:
                    result = "Five hundred and ";
                    break;
                case 6:
                    result = "Six hundred and ";
                    break;
                case 7:
                    result = "Seven hundred and ";
                    break;
                case 8:
                    result = "Eight hundred and ";
                    break;
                case 9:
                    result = "Nine hundred and ";
                    break;
            }
            result += twoNum(other);
        } else {
            switch (hundred) {
                case 1:
                    result = "One hundred ";
                    break;
                case 2:
                    result = "Two hundred ";
                    break;
                case 3:
                    result = "Three hundred ";
                    break;
                case 4:
                    result = "Four hundred ";
                    break;
                case 5:
                    result = "Five hundred ";
                    break;
                case 6:
                    result = "Six hundred ";
                    break;
                case 7:
                    result = "Seven hundred ";
                    break;
                case 8:
                    result = "Eight hundred";
                    break;
                case 9:
                    result = "Nine hundred";
                    break;
            }
        }
        return result;
    }
}
