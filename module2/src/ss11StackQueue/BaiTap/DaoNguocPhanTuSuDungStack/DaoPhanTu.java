package ss11StackQueue.BaiTap.DaoNguocPhanTuSuDungStack;

import java.util.Stack;

public class DaoPhanTu {
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<>();
        int arr[] = {1,2,3,4,5};
        for (int i = 0 ;i<arr.length;i++){
            intStack.push(arr[i]);
        }
        System.out.println("Mang sau khi dao: ");
        int i = 0;
        while (!intStack.empty()){
            arr[i]=intStack.pop();
            System.out.print(arr[i]+"\t");
            i++;
        }
    }
}
