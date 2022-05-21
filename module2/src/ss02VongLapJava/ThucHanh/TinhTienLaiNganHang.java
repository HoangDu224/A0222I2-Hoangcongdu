package ss02VongLapJava.ThucHanh;
import java.util.Scanner;
public class TinhTienLaiNganHang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien gui: ");
        double monney = scanner.nextDouble();
        System.out.println("Nhap so thang gui: ");
        int month = scanner.nextInt();
        System.out.println("Nhap lai suat: ");
        double laisuat = scanner.nextDouble();
        double total = 0;
        for (int i = 0 ; i<month;i++){
            total +=monney*(laisuat/100)/12*month;
        }
        System.out.println("Tong tien nhan duoc: "+total);
    }
}
