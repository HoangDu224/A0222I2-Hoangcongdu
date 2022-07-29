package ss015DebugException.excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SuDungLopillegalTriangleExCepTion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhap 3 canh cua tam giac");
                System.out.println("Canh a:");
                double a = Double.parseDouble(scan.nextLine());
                System.out.println("Canh b:");
                double b = Double.parseDouble(scan.nextLine());
                System.out.println("Canh c:");
                double c = Double.parseDouble(scan.nextLine());
                Triagle triagle = new Triagle(a, b, c);
                break;
            } catch (InputMismatchException | NumberFormatException e) {
                System.err.println(e.getMessage());
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } while (true);
    }
}

class Triagle {
    private double side1;
    private double side2;
    private double side3;

    @Override
    public String toString() {
        return "Triagle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triagle(double side1, double side2, double side3) throws IllegalTriangleException {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (side1 < 0 || side2 < 0 || side3 < 0) {
            throw new IllegalTriangleException("side < 0 ");
        } else if (side1 + side2 < side3 || side2 + side3 < side1 || side3 + side1 < side2) {
            throw new IllegalTriangleException("sum 2 side < 1 side");
        }
    }
}

class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
