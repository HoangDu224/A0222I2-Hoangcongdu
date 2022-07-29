package ss02_Loop_Java.ThucHanh;
import java.util.Scanner;
public class UocChungLonnhat {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap So a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap So b: ");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0){
            System.out.println("Khong Co uoc chung lon nhat");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
