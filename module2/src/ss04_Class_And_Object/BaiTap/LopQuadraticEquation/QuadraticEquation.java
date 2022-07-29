package ss04_Class_And_Object.BaiTap.LopQuadraticEquation;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhap b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhap c: ");
        double c = scanner.nextDouble();
        LopQuadraticEquation pt1 = new LopQuadraticEquation(a,b,c);
        if (pt1.getDiscriminant()==0){
            System.out.print("Phuong trinh co 1 nghiem: \n"+pt1.getRoot1());
        }else if (pt1.getDiscriminant()>=0){
                System.out.print("Phuong trinh co 2 nghiem: \n"+pt1.getRoot1()+"\n"+pt1.getRoot2());
        }else {
            System.out.println("The equation has no roots");
        }
    }
}
