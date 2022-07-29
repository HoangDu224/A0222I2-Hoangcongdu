package ss03_Array_And_Method.BaiTap;

import java.util.Scanner;

public class TongCacSoOMotCotXacDinh {
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
        System.out.println("Chon cot muon tinh tong: ");
        int choose = scanner.nextInt();
        int total =0 ;
        for (int i = 0 ; i<array.length;i++){
            for (int n = 0 ; n<array[i].length;n++){
                if (n == choose ){
                    total += array[i][n];
                }
            }
        }
        System.out.println(total);
    }
}
