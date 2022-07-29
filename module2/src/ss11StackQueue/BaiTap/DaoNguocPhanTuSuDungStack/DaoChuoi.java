package ss11StackQueue.BaiTap.DaoNguocPhanTuSuDungStack;

import java.util.Stack;

public class DaoChuoi {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        String str = "AbcDef";
        String arr[] = str.split("");
        for (int i = 0; i < arr.length; i++) {
            wStack.push(arr[i]);
        }
        String result = "";
        while (!wStack.empty()) {
            result += wStack.pop();
        }
        System.out.println(result);
    }
}
