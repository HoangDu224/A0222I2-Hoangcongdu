package case_study.contronller.FuramaController;

import java.awt.*;
import java.util.Scanner;

public class DisplayMainMenu {
    static Scanner scanner = new Scanner(System.in);
    public static void display() {
        int tabMenuChoose;
        while (true) {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tEmployee Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            int mainMenuChoose = scanner.nextInt();
            switch (mainMenuChoose) {
                case 1:
                    System.out.println("1\tDisplay list employees");
                    System.out.println("2\tAdd new employee");
                    System.out.println("3\tEdit employee");
                    System.out.println("4\tReturn main Menu");
                    tabMenuChoose = scanner.nextInt();
                    switch (tabMenuChoose) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            display();
                    }
                    break;
                case 2:
                    System.out.println("1.\tDisplay list customers");
                    System.out.println("2.\tAdd new customer");
                    System.out.println("3.\tEdit customer");
                    System.out.println("4.\tReturn main Menu");
                    tabMenuChoose = scanner.nextInt();
                    switch (tabMenuChoose) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            display();
                    }
                    break;
                case 3:
                    System.out.println("1\tDisplay list facility");
                    System.out.println("2\tAdd new facility");
                    System.out.println("3\tDisplay list facility maintenance");
                    System.out.println("4\tReturn main Menu");
                    tabMenuChoose = scanner.nextInt();
                    switch (tabMenuChoose) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            display();
                    }
                    break;
                case 4:
                    System.out.println("1.\tAdd new booking");
                    System.out.println("2.\tDisplay list booking");
                    System.out.println("3.\tCreate new constracts");
                    System.out.println("4.\tDisplay list contracts");
                    System.out.println("5.\tEdit contracts");
                    System.out.println("6.\tReturn main Menu");
                    tabMenuChoose = scanner.nextInt();
                    switch (tabMenuChoose) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:
                            display();
                    }
                    break;
                case 5:
                    System.out.println("1.\tDisplay list customers use service");
                    System.out.println("2.\tDisplay list customers get voucher");
                    System.out.println("3.\tReturn main Menu");
                    tabMenuChoose = scanner.nextInt();
                    switch (tabMenuChoose) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            display();
                    }
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}