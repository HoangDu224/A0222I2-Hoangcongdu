package ss01_introduction_to_java.excercise;

import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so USD can chuyen: ");
        float usd = scanner.nextFloat();
        float vnd = usd * 23000;
        System.out.println("VND Nhận được là: " + vnd);
    }
}
