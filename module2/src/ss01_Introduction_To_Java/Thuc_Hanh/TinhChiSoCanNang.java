package ss01_Introduction_To_Java.Thuc_Hanh;

import java.util.Scanner;

public class TinhChiSoCanNang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Input height");
        double height = scanner.nextDouble();
        double BMI = weight * (height * height);
        /* bmi = weight / Math.pow(height, 2) */
        if (BMI > 30) {
            System.out.println("Obese");
        } else if (BMI > 25) {
            System.out.println("Overweight");
        } else if (BMI > 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Obese");
        }
    }
}
