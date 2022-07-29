package ThiModule.Service;

import File_Helper.FileHelper;
import ThiModule.BenhAn.BenhAn;
import ThiModule.BenhAn.BenhAnThuong;
import ThiModule.Exception.NotFoundMedicalRecordException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MedicalSerVice {
    Scanner scan = new Scanner(System.in);
    private static FileHelper fileHelper = new FileHelper();
    private static List<BenhAn> benhAnList = new ArrayList<>();
    static int id = 1;
    private final static String PATH = "src\\ThiModule\\csvFile.csv";

    static {
        BenhAnThuong benhAnThuong = new BenhAnThuong(0, "BA-111", "BN-123", "Nguyen Van A", "07-08-2016", "08-08-2019", "Ung Thu Gan", 200);
        BenhAnThuong benhAnThuong1 = new BenhAnThuong(0, "BA-222", "BN-123", "Nguyen Van B", "07-08-2016", "08-08-2019", "Ung Thu Gan", 2000);
        benhAnList.add(benhAnThuong);
        benhAnList.add(benhAnThuong1);
    }

    public void addBenhAn(BenhAn benhAn) {
        benhAnList.add(benhAn);
        benhAnList.get(benhAnList.size() - 1).setStt(id++);
    }

    public List<ThiModule.BenhAn.BenhAn> findAll() {
        return benhAnList;
    }

    public void delete(String Id) throws NotFoundMedicalRecordException {
        for (BenhAn benhAn : benhAnList) {
            if (benhAn.getMaBenhAn().equals(Id)) {
                System.out.println("Yes or no:");
                boolean choose = Boolean.parseBoolean(scan.nextLine());
                if (choose) {
                    benhAnList.remove(benhAn);
                    return;
                } else {
                    return;
                }
            }
        }
        throw new NotFoundMedicalRecordException("Benh An Khong Tim Thay:");
    }

    private void listToCVS() throws IOException {
        fileHelper.writeFileCSV("src\\ThiModule\\csvFile.csv",benhAnList,true);
    }
}
