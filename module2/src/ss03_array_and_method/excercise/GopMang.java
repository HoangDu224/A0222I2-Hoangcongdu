package BaiTap.ss03;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array1[] = new int[4];
        int array2[] = new int[6];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Input value array1 index " + i);
            array1[i] = scanner.nextInt();
        }
        System.out.println("Mang 1 da nhap vao: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println("\nInput value array2 index " + i);
            array2[i] = scanner.nextInt();
        }
        System.out.println("Mang 2 da nhap vao: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + "\t");
        }
        int index = array1.length;
        int array3[] = new int[array1.length + array2.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[index] = array2[i];
            index++;
        }
        System.out.println("\nMang 3 da gop vao: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
