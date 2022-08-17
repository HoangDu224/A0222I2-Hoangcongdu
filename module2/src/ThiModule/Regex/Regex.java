package ThiModule.Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    Scanner scanner = new Scanner(System.in);
    public static final String DAY_REGEX = "^([0-2][0-9]|3[0|1])[-|/|.](\\d|1[0|2])[-|/]\\d{4}$";
    public static final String PHONE_REGEX = "^[\\d]*$";
    public static final String BN_REGEX = "^[B][N][-][\\d]{3}$";
    public static final String BA_REGEX = "^[B][A][-][\\d]{3}$";
    public static final String NAME_REGEX = "^[A-Z]{1,}[a-z]*[ ][A-Z]{1,}[a-z]*[$|[ ]]";

    public Regex() {
    }
    public String regexSTR(String strCheck, String strRegex, String error) {
        boolean check = true;
        do {
            if (strCheck.matches(strRegex)) {
                check = false;
            } else {
                System.out.println(error);
                strCheck = scanner.nextLine();
            }
        } while (check);
        return strCheck;
    }
    public String checkBN(String strBN){
        return regexSTR(strBN,BN_REGEX,"Nhap sai:");
    }
    public String checkBA(String strBA){
        return regexSTR(strBA,BA_REGEX,"Nhap sai:");
    }
    public String checkDate(String strDate){
        return regexSTR(strDate , DAY_REGEX,"Nhap sai:");
    }
}

