package ss19_String_Regex.practice.EmailRegex;

public class EmailTest {
    public static void main(String[] args) {
        EmailRegex emailRegex = new EmailRegex();
        String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
//        for (String email : validEmail){
//            boolean isvalid = emailRegex.validate(email);
//            System.out.println("Email is "+email+ " is valid "+isvalid);
//        }
        for (String email : invalidEmail){
            boolean isvalid = emailRegex.validate(email);
            System.out.println("Email is "+email+ " is valid "+isvalid);
        }
    }
}
