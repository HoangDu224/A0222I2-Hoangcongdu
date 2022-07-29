package ss16IOfile.practice.TimSoLonNhatTrongFileText;

import java.util.List;

public class findMaxNumber {
    public static void main(String[] args) {
        readAndWriteFile readAndWriteFile = new readAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src\\ss16IOfile\\ThucHanh\\TimSoLonNhatTrongFileText\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src\\ss16IOfile\\ThucHanh\\TimSoLonNhatTrongFileText\\result.txt", maxValue);
    }

    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
}
