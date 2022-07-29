package ss015DebugException.ThucHanh;

import java.util.Random;
import java.util.Scanner;

public class SuDungLopArrayIndexOfBoundException {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();
        Scanner scan = new Scanner(System.in);
        System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
        int x = scan.nextInt();
        try {
            System.err.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Chỉ số vượt quá giới hạn của mảng");
        }

    }

    public static class ArrayExample {
        public Integer[] createRandom() {
            Random rd = new Random();
            Integer[] arr = new Integer[100];
            System.out.println("Danh sach phan tu cua mang: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = rd.nextInt();
                System.out.print(arr[i] + " ");
            }
            return arr;
        }
    }
}
