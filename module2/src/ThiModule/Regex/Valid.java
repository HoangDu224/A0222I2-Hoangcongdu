package ThiModule.Regex;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Valid {
    public static boolean isNumber(String num) {
        try {
            Double.parseDouble(num);

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static int checkDay(String dayIn, String dayOut) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date day1 = null;
        Date day2 = null;
        try {
            day1 = sdf.parse(dayIn);
            day2 = sdf.parse(dayOut);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        assert day2 != null;
        if (day2.compareTo(day1) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
