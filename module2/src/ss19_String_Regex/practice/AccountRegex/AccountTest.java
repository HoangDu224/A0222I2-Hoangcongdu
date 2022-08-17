package ss19_String_Regex.practice.AccountRegex;

public class AccountTest {
    public static void main(String[] args) {
        AccountRegex accountRegex = new AccountRegex();
        String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
        String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };
        for (String account : invalidAccount){
            boolean isvalid = accountRegex.valiDate(account);
            System.out.println("Account is " + account +" is valid: "+ isvalid);
        }
    }
}
