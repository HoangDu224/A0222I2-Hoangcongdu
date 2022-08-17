package ss19_String_Regex.practice.Regex;

import java.util.Scanner;

public class RegexTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Regex regex = new Regex();
        while (true) {
            System.out.println("Nhap :");
            String input = scanner.nextLine();
            System.out.println(regex.valiDateName(input));
        }
    }
}
