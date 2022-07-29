package ss04_Class_And_Object.practice.LopHinhChuNhat;

import java.util.Scanner;

public class LopHinhChuNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle hcn1 = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + hcn1.display());
        System.out.println("Area of the Rectangle: \n" + hcn1.getArea());
        System.out.println("Perimeter of the Rectangle: \n" + hcn1.getPerimeter());
    }
}

