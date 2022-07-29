package ss04_Class_And_Object.BaiTap.LopStopWatch;

public class StopWatch {
    public static void main(String[] args) {
        LopStopWatch watch1 = new LopStopWatch();
        System.out.println("Start: "+watch1.start());
        double arr[]= new double[10];
        for (int i = 0 ; i <arr.length;i++){
            arr[i] = Math.floor(Math.random()*99);
        }
        System.out.println("\nEnd: "+watch1.stop());
        SelectionSort ss = new SelectionSort();
        System.out.println("Mang truoc khi sap xep: ");
        ss.printArr(arr);
        ss.Seletionsort(arr);
        System.out.println("\nMang sau khi sap xep: ");
        ss.printArr(arr);
        System.out.println("\nEnd: "+watch1.stop());
        System.out.println("\n Elappsed: "+watch1.getElapsedTime());
    }
    public static class SelectionSort{
        void Seletionsort(double[] arr){
            int a = arr.length;
            for( int i = 0 ; i<a-1;i++){
                int min = i;
                for (int n = i+1 ; n<arr.length;n++)
                    if (arr[n]<arr[min]){
                        min = n;
                    }
                double temp = arr[min];
                arr[min]= arr[i];
                arr[i] = temp;
            }
        }
        void printArr(double[] arr){
            for (int i = 0 ; i<arr.length;i++){
                System.out.print("\t"+arr[i]+" ");
            }
        }
        void SortArrays(double[] arr) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    j = -1;
                }
            }
        }
    }
}
