package ss16IOfile.practice.TimSoLonNhatTrongFileText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class readAndWriteFile {
    public List<Integer> readFile(String filepath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Gia tri lon nhat laa " + max);
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
