package ss14ThuatToanSapXep.excercise;

public class MinhHoaThuatToanSapXepChen {
    public static void main(String[] args) {
        int[] arr = {10, 7, 3, 4, 5, 1, 2};
        insertionSort(arr);
    }

    static void insertionSort(int[] array) {
        int x, pos;
        for (int i = 0; i < array.length; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            array[pos] = x;
            System.out.println("\nArray sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + " ");
            }
        }
    }
}
