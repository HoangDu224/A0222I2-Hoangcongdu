package ss03MangVaPhuongThucTrongJava.BaiTap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,4,6,7,8,6,0,0,0,0};
        System.out.println("Nhap phan tu can xoa");
        int x = scanner.nextInt();
        int index=0;
        boolean check = true;
        for (int i = 0 ; i<array.length;i++){
            if (array[i]==x){
                 index = i;
                for (;index<array.length-1;index++){
                    array[index]= array[index+1];
                }
            }
            }
        System.out.println("Mang sau khi xoa");
        for (int i = 0 ; i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}
