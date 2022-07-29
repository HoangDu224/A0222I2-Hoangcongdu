package ss01_Introduction_To_Java.Bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so USD can chuyen: ");
        float usd = scanner.nextFloat();
        float vnd = usd * 23000;
        System.out.println("VND Nhận được là: " + vnd);
    }
}
