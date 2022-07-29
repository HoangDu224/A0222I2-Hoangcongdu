package ss01_introduction_to_java.excercise;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Name");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);
    }
}
