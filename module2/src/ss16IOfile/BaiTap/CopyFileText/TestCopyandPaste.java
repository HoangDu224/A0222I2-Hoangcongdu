package ss16IOfile.BaiTap.CopyFileText;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestCopyandPaste {
    public static void main(String[] args) {
        CopyAndPaste test1 = new CopyAndPaste();
        try {
            test1.copyAndPasteFile("src\\ss16IOfile\\BaiTap\\CopyFileText\\copyFile.txt","D:\\codegym\\A0222I2-Hoangcongdu\\module2\\src\\ss16IOfile\\BaiTap\\CopyFileText\\pasteFile.txt");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
