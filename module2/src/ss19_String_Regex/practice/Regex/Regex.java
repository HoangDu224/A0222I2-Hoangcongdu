package ss19_String_Regex.practice.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static final String DAY_REGEX = "^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$";
    public static final String PHONE_REGEX = "^[\\d]*$";
    public static final String BN_REGEX = "^[B][N][-][\\d]{3,}$";
    public static final String NAME_REGEX = "^[A-Z]{1,}[a-z]*[ ][A-Z]{1,}[a-z]*[$|[ ]]";

    public Regex() {
    }

    public boolean valiDateDay(String regex) {
        Pattern pattern = Pattern.compile(DAY_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean valiDatePhone(String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean valiDateBN(String regex) {
        Pattern pattern = Pattern.compile(BN_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
    public boolean valiDateName(String regex) {
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
