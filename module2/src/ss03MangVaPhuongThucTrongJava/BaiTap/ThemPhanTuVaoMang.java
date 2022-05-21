package ss03MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        System.out.println("Enter Size: ");
        size = scanner.nextInt();
        array = new int[size];
        for (int i = 0 ; i<array.length;i++){
            System.out.println("Input index "+i);
            array[i]=scanner.nextInt();
        }
        System.out.println("Nhap so can chen:");
        int value = scanner.nextInt();
        System.out.println("Nhap vi tri can chen");
        int index = scanner.nextInt();
        if (index<=1 || index>=array.length-1){
            System.out.println("không chèn được phần tử vào mảng.");
        }else {
            array[index]=value;
            for (int i = index+1 ;index<array.length;index++){
            }
        for (int i = 0 ; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
        }
    }
}

