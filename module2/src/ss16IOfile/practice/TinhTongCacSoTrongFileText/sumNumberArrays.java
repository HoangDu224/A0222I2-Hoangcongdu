package ss16IOfile.practice.TinhTongCacSoTrongFileText;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class sumNumberArrays {
    public static void main(String[] args) {
        sumNumberArrays result = new sumNumberArrays();
        System.out.println(result.sumNumbersFile("src\\ss16IOfile\\ThucHanh\\TimSoLonNhatTrongFileText\\numbers.txt"));

    }

    public int sumNumbersFile(String filepath) {
        int sum = 0;
        try {
            File file = new File(filepath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return sum;
    }
}
