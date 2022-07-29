package ss16IOfile.BaiTap.DocFileCSV;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        try {
            String line;
            File file = new File("src\\ss16IOfile\\BaiTap\\DocFileCSV\\countries.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while ((line = bufferedReader.readLine()) != null) {
                printCountry(readFile(line));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static List<String> readFile(String cvsline) {
        List<String> result = new ArrayList<>();
        if (!cvsline.isEmpty()) {
            String[] splitArr = cvsline.split(",");
            for (int i = 0; i < splitArr.length; i++) {
                result.add(splitArr[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> country) {
        System.out.println(
                "Country [id= "
                        + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]");
    }
}
