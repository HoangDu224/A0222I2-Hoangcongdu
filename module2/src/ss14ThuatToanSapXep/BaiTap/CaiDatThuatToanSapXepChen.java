package ss14ThuatToanSapXep.BaiTap;

public class CaiDatThuatToanSapXepChen {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2, 100};
        insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void insertionSort(int[] array) {
        int x, pos;
        for (int i = 1; i < array.length - 1; i++) {
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1];
                pos--;
            }
            ;
            array[pos] = x;
        }
    }
}
