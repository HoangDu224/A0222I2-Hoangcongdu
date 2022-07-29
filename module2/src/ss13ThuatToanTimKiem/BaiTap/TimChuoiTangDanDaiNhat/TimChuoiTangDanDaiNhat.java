package ss13ThuatToanTimKiem.BaiTap.TimChuoiTangDanDaiNhat;


import java.util.LinkedList;

public class TimChuoiTangDanDaiNhat {
    public static void main(String[] args) {
        String str = "abcabcdgabmnsxy";
        LinkedList<Character> max = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) > list.getLast()) {
                    list.add(str.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        System.out.println(max);
    }
}
