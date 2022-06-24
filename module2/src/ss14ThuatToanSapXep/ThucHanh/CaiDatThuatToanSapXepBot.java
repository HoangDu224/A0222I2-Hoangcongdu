package ss14ThuatToanSapXep.ThucHanh;

public class CaiDatThuatToanSapXepBot {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,1,2,3,10};
        bubbleSort(arr);
        for (int i = 0 ; i<arr.length-1;i++){
            System.out.println(arr[i]);
        }
    }
    static void bubbleSort(int[] arr){
        for (int i = 0;i<arr.length-1;i++){
            for (int j = arr.length-1;j>i;j--){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
            System.out.println("\nBegin sorting processing...");
            for (int a = 0 ; a<arr.length;a++){
                System.out.print(arr[a]+" ");
            }
        }
    }
}
