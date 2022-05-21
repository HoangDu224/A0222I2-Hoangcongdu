package ss01IntroductiontoJava.Bai_tap;
import java.util.Scanner;
public class HienThiLoiChao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);
    }
}
