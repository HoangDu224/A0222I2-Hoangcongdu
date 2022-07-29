package ss03_Array_And_Method.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu trong mang: ");
        int size = scanner.nextInt();
        int array[]= new int[size];
        for (int i = 0 ; i<array.length; i++){
            System.out.println("Nhap gia tri cua index "+i);
            array[i]= scanner.nextInt();
        }
        System.out.println("Mang da nhap vao: ");
        for (int i = 0 ; i<array.length;i++){
            System.out.println(array[i]);
        }
        int min = array[0];
        for (int i = 1 ; i<array.length;i++){
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.printf("Gia tri nho nhat : ");
        System.out.println(min);
    }
}
