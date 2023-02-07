package ss01_introduction_to_java.excercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Map<String,String> tudien;
            tudien = new HashMap<>();
            tudien.put("Hello", "Xin Chao");
            tudien.put("Goodbye","Tam Biet");
            tudien.put("Street", "Con Duong");
        System.out.println(tudien.get(3));
    }
}
