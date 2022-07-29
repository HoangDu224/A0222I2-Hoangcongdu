package ss03_Array_And_Method.ThucHanh;

import java.util.Scanner;

public class ChuongTrinhChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit ");
        System.out.println("Enter your choose ");
        choose = scanner.nextInt();
        switch (choose){
            case 1:
                System.out.println("Enter Fahrenheit: ");
                double Fahrenheit = scanner.nextDouble();
                System.out.println("Celsius: "+fahrenheitToCelsius(Fahrenheit));
                break;
            case 2:
                System.out.println("Enter Celsius: ");
                double Celsius = scanner.nextDouble();
                System.out.println("Celsius: "+celsiusToFahrenheit(Celsius));
                break;
            case 0:
                System.exit(0);
        }
        }while (choose!=0);
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
    public static double celsiusToFahrenheit(double celsius){
        double Fahrenheit = (9.0 / 5) * celsius + 32;
        return Fahrenheit;
    }
}
