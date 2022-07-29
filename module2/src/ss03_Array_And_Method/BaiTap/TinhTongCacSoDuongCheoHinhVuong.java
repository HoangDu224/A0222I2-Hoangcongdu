package ss03_Array_And_Method.BaiTap;

import java.util.Scanner;

public class TinhTongCacSoDuongCheoHinhVuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[][]= new int[3][3];
        for (int i = 0 ; i<array.length;i++){
            for (int n = 0 ; n<array[i].length;n++){
                System.out.println("array["+i+"]["+n+"]");
                array[i][n]=scanner.nextInt();
            }
        }
        for (int i = 0 ; i<array.length;i++){
            for (int n = 0 ; n<array[i].length;n++){
                System.out.print(array[i][n]+ " ");
            }
            System.out.println();
        }
        int total =  0 ;
        System.out.println("Chon duong cheo 1 hay 2: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
            {
                for (int i = 0 ; i<array.length;i++){
                for (int n = 0 ; n<array[i].length;n++){
                if (i == n){
                    total += array[i][n];
                }
            }
        }
        System.out.println(total);
            }
            break;
            case 2:
             {
                 for (int i = 0 ; i<array.length;i++){
                for (int n = 0 ; n<array[i].length;n++){
                    if (i+n==array.length-1){
                        total +=array[i][n];
                    }
                }
            }
                System.out.println(total);
        }
    }
}
}
