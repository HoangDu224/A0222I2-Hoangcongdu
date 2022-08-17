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
    public static List<BenhAn> benhAnList = new ArrayList<>();
    static int id = 1;
    private final static String PATH = "src\\ThiModule\\testfile.csv";

    public MedicalSerVice() {
        benhAnList = fileHelper.readFileCSV(PATH);
    }

    public void addBenhAn(BenhAn benhAn) {
        benhAnList.add(benhAn);
        benhAnList.get(benhAnList.size() - 1).setStt(id++);
        fileHelper.writeFileCSV(PATH,benhAnList,false);
    }

    public List<ThiModule.BenhAn.BenhAn> findAll() {
        return benhAnList;
    }

    public void delete(String Id) throws NotFoundMedicalRecordException {
        for (BenhAn benhAn : benhAnList) {
            if (benhAn.getMaBenhAn().equals(Id)) {
                System.out.println("Yes or no:");
                String choose = scan.nextLine();
                if (choose.equals("yes") || choose.equals("Yes")) {
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
        fileHelper.writeFileCSV(PATH, benhAnList, true);
    }
}
