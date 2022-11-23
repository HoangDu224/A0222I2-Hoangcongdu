package tudien.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TuDien {

    private static Map<String, String> tudien;

    static {
        tudien = new HashMap<>();
        tudien.put("Hello", "Xin Chao");
        tudien.put("Goodbye", "Tam Biet");
        tudien.put("Street", "Con Duong");
    }

    public String search(String key) {
        if (tudien.get(key) == null) {
            return "Khong tim thay ";
        }
        return tudien.get(key);
    }
}
