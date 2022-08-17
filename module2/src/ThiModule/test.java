package ThiModule;

import File_Helper.FileHelper;
import ThiModule.BenhAn.BenhAn;
import ThiModule.BenhAn.BenhAnThuong;
import ThiModule.BenhAn.BenhAnVip;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) throws IOException {
        BenhAnThuong benhAnThuong = new BenhAnThuong(1, "BA-111", "BN-123", "Nguyen Van A", "07-08-2016", "08-08-2019", "Ung Thu Gan", 200);
        BenhAnVip benhAnThuong1 = new BenhAnVip(2, "BA-222", "BN-123", "Nguyen Van B", "07-08-2016", "08-08-2019", "Ung Thu Gan", "Vip 1", "20-2-2022");
        FileHelper fileHelper = new FileHelper();
        List<BenhAn> benhAnList = new ArrayList<>();
        benhAnList.add(benhAnThuong);
        benhAnList.add(benhAnThuong1);
//        fileHelper.writeFileCSV("src\\ThiModule\\testfile.csv",benhAnList,false);
        List<BenhAn> readCsvFile = fileHelper.readFileCSV("src\\ThiModule\\testfile.csv");
        for (int i = 0 ; i<readCsvFile.size();i++){
            System.out.print(readCsvFile.get(i)+"\n");

        }
    }
}
