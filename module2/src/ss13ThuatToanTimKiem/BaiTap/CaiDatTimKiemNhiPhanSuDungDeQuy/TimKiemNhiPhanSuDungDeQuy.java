package ss13ThuatToanTimKiem.BaiTap.CaiDatTimKiemNhiPhanSuDungDeQuy;

public class TimKiemNhiPhanSuDungDeQuy {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(array, 100, 0, array.length - 1));
    }

    static int binarySearch(int[] array, int key, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (key == array[mid]) {
                return array[mid];
            } else if (key > array[mid]) {
                return binarySearch(array, key, mid + 1, high);
            } else {
                return binarySearch(array, key, low, mid - 1);
            }
        }
        return -1;
    }
}
