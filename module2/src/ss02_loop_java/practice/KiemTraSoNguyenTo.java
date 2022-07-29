package ss02_loop_java.practice;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can kiem tra: ");
        int inputNum = scanner.nextInt();
        boolean check = true;
        if (inputNum < 2) {
            System.out.println(inputNum + " Khong phai snt");
        } else {
            int i = 2;
            while (i < inputNum) {
                if (inputNum % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        if (check) {
            System.out.println(inputNum + " La snt");
        } else {
            System.out.println(inputNum + " Khong Phai snt");
        }
    }
}
