package ThiModule;

import java.io.CharArrayReader;
import java.io.IOException;
import java.text.ParseException;

public class test {
    public static void main(String[] args) throws IOException, ParseException {
        String x = "abc";
        String y = "ab";
         x = x.concat(y);
        System.out.println(x);

    }
}
