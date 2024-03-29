package ss19_String_Regex.practice.EmailRegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[\\w\\d]+[\\w\\d]*@[\\w\\d]+(\\.[\\w\\d])+$";
    public EmailRegex(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
