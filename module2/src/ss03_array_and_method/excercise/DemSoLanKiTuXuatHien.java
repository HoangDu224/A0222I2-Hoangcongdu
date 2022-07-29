package ss03_array_and_method.excercise;

import java.util.Scanner;

public class DemSoLanKiTuXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra :");
        String str = scanner.nextLine();
        System.out.println("Nhap keyword can kiem tra :");
        String keyword = scanner.nextLine();
        System.out.println(Count(str,keyword));
    }
    public static int Count(String str , String keyword){
        String[] arrStr = str.split("");
        int count = 0 ;
        for (int i = 0 ; i <arrStr.length;i++){
            if (arrStr[i].equals(keyword)){
                count++;
            }
        }
        return count;
    }
}
