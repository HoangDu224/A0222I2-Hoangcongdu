package ss03MangVaPhuongThucTrongJava.ThucHanh;

import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.println("Enter size");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("Size khong duoc qua 20");
            }
        }while (size>20);
        array = new int[size];
        for (int i = 0 ; i<array.length;i++){
            System.out.println("Nhap gia tri index "+i);
            array[i]= scanner.nextInt();
        }
        System.out.println("Mang da nhap vao");
        for (int i = 0 ; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println("\nGia Tri Lon Nhat");
        int max = array[0];
        int index = 0;
        for (int i = 1;i<array.length;i++){
            if (array[i]>max){
                max = array[i];
                index = i+1;
            }
        }
        System.out.println(max);
        System.out.println("Vi tri: "+index);
    }
}
