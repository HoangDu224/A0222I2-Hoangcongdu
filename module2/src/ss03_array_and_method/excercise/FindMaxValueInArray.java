package ss03_array_and_method.excercise;

import java.util.Scanner;

public class FindMaxValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double array[][] = new double[3][2];
        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array[i].length; n++) {
                System.out.println("array[" + i + "][" + n + "]");
                array[i][n] = scanner.nextDouble();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array[i].length; n++) {
                System.out.print(array[i][n] + " ");
            }
            System.out.println();
        }
        double max = array[0][0];
        String vitri = null;
        for (int i = 0; i < array.length; i++) {
            for (int n = 0; n < array[i].length; n++) {
                if (array[i][n] > max) {
                    max = array[i][n];
                    vitri = "array[" + i + "][" + n + "]";
                }
            }
        }
        System.out.println("Gia Tri Lon Nhat: ");
        System.out.println(max);
        System.out.printf("Vi Tri: ");
        System.out.println(vitri);
    }
}

