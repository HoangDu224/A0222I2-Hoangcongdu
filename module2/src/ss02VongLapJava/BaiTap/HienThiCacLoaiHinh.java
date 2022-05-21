package ss02VongLapJava.BaiTap;

import jdk.nashorn.internal.parser.JSONParser;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        System.out.println("Enter your choice: ");
        int choose = scanner.nextInt();
        switch (choose){
            case 1:
                for (int i = 0 ; i<5;i++){
                        System.out.println("* * * * * * * *");
                    }
                break;
            case 2:
                for (int i = 0 ; i<=5;i++){
                    for (int n = 0 ; n<i;n++){
                        System.out.print(" * ");
                    }
                    System.out.println("\n");
                }
                for (int i = 5 ; i>=0;i--){
                    for (int n=0 ; n<i;n++){
                        System.out.print(" * ");
                    }System.out.println("\n");
                }
                for (int i = 0 ; i<=5;i++){
                    for (int space = 5 ; space>i;space--){
                        System.out.print("   ");
                    }
                    for (int n = 0 ; n<i;n++){
                        System.out.print(" * ");
                    }
                    System.out.println("\n");
                }
                for (int i = 5 ; i>=0;i--){
                    for (int space = 5 ; space>i;space--){
                        System.out.print("   ");
                    }
                    for (int n=0 ; n<i;n++){
                        System.out.print(" * ");
                    }System.out.println("\n");
                }
                break;
            case 3:
                for (int i = 0 ; i < 5 ; i++){
                    for (int space = 5 ; space>i;space--){
                        System.out.print("   ");
                    }
                    for (int n = 0 ; n<i*2-1;n++){
                        System.out.print(" * ");
                    }System.out.println("\n");
                }
        }
    }
}
