package ss02_loop_java.excercise;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong so snt can in ra");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 1; count < number; i++) {
            if (checkSnt(i)) {
                System.out.println(i);
                count++;
            }
        }
    }

    public static boolean checkSnt(int num) {
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }
}
