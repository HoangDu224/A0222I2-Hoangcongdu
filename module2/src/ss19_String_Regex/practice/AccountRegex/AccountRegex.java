package ss19_String_Regex.practice.AccountRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountRegex {
    private Pattern pattern;
    private Matcher matcher;
    private static final String ACCOUNT_REGEX = "^[_\\da-z]{6,}$";
    public AccountRegex (){

    }
    public boolean valiDate(String regex){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
