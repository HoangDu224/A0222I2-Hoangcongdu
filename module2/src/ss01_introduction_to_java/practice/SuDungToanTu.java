package ss01_introduction_to_java.practice;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float wight;
        float height;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter wight: ");
        wight = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        float s = wight * height;
        System.out.println("Area is =" + s);

    }
}
