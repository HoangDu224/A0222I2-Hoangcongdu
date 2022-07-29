package ss03_Array_And_Method.ThucHanh;

import java.util.Scanner;

public class TimGiaTriTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya"};
        System.out.println("Enter a name's student");
        String nameInput = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < student.length; i++) {
            if (student[i].equals(nameInput)) {
                System.out.println("Position of the students in the list " + nameInput + " is: " + (i + 1));
                check = true;
            }
        }
        if (!check){
            System.out.println("Not found");
        }
    }
}
