package ss17BinaryFileAndSerialization.excercise.CopyFileNhiPhan;

import java.io.*;

public class main {
    public static void main(String[] args) {
        copyFile("src\\ss17BinaryFileAndSerialization\\BaiTap\\CopyFileNhiPhan\\fileCopy.txt", "src\\ss17BinaryFileAndSerialization\\BaiTap\\CopyFileNhiPhan\\filePaste.txt");
    }

    public static void copyFile(String fileCopyPath, String filePastePath) {
        try {
            File file = new File(fileCopyPath);
            if (!file.exists()) {
                System.err.println("File copy khong ton tai");
            } else {
                FileInputStream fis = new FileInputStream(fileCopyPath);
                FileOutputStream fos = new FileOutputStream(filePastePath);
                int i;
                do {
                    i = fis.read();
                    if (i != -1) {
                        fos.write(i);
                    }
                } while (i != -1);
                fos.close();
                fis.close();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
