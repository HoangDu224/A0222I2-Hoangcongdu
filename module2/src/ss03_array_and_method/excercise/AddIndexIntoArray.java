package BaiTap.ss03;

import java.util.Scanner;

public class AddIndexIntoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter size: ");
        int size = scanner.nextInt();
        int OldArray[] = new int[size];
        for (int i = 0; i < OldArray.length; i++) {
            System.out.println("Input value index " + i);
            OldArray[i] = scanner.nextInt();
        }
        System.out.println("Mang da nhap vao: ");
        for (int i = 0; i < OldArray.length; i++) {
            System.out.print(OldArray[i] + "\t");
        }
        System.out.println("\nNhap gia tri muon them vao: ");
        int value = scanner.nextInt();
        System.out.println("Nhap vi tri :");
        int position = scanner.nextInt();

        int n = OldArray.length;
        int array[] = new int[n + 1];
        while (position < 0 || position > array.length) {
            System.out.println(" không chèn được phần tử vào mảng.");
            System.out.println(" Nhap lai");
            position = scanner.nextInt();
        }
        for (int i = 0, k = 0; i < array.length; i++) {
            if (i == position) {
                array[i] = value;
                continue;
            }
            array[i] = OldArray[k];
            k++;
        }
        System.out.println("Mang sau khi them vao:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(array[i] + "\t");
        }
    }
}
