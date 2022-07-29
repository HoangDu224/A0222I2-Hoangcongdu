package ss02_Loop_Java.BaiTap;


public class HienThiTatCaSoNguyenToDuoi100 {
    public static void main(String[] args) {
        int number = 100;
        for (int i = 1; i < number; i++) {
            if (checkSnt(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean checkSnt(int num) {
        boolean check = true;
        if (num < 2) {
            check = false;
        } else {
            int i = 2;
            while (i < num) {
                if (num % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
        }
        return check;
    }

}