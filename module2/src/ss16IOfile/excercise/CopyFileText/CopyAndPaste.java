package ss16IOfile.excercise.CopyFileText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyAndPaste {
    public void copyAndPasteFile(String filecopy, String filepaste) throws IOException {
        Scanner scan = new Scanner(System.in);
        List<String> arr = new ArrayList<>();
//        try {
        File file = new File(filecopy);
        if (!file.exists()) {
            System.out.println("File copy khong ton tai");
        }
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        while ((line = br.readLine()) != null) {
            arr.add(line);
        }
        br.close();
        File file2 = new File(filepaste);
        if (!file2.exists()) {
            System.out.println("File paste khong ton tai");
        } else {
            System.out.println("File paste da ton tai");
            boolean append = false;
            boolean check = true;
            do {
                System.out.println("1. Ghi de fileThi");
                System.out.println("2. Ghi tiep fileThi");
                int choose = Integer.parseInt(scan.nextLine());
                switch (choose) {
                    case 1:
                        append = false;
                        check = false;
                        break;
                    case 2:
                        append = true;
                        check = false;
                        break;
                }
            } while (check);
            FileWriter writer = new FileWriter(filepaste, append);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            for (int i = 0; i < arr.size(); i++) {
                bufferedWriter.write(arr.get(i));
            }
            bufferedWriter.close();
        }
//        } catch (Exception e){
//            System.err.println(e.getMessage());
//        }
    }
}


