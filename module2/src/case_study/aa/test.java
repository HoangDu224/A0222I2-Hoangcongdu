package case_study.aa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test {
    public static void main(String[] args) {
        for (int i = 1 ; i<10;i++){
            System.out.println(findFibonacci(i));
        }
    }
    public static int findFibonacci(int n){
        if (n<0){
            return -1;
        }else if (n == 0 || n == 1 ){
            return n;
        }else {
            return findFibonacci(n-1)+findFibonacci(n-2);
        }
    }
}
