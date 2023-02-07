package ThiModule.Menu;

import File_Helper.FileHelper;
import ThiModule.BenhAn.BenhAn;
import ThiModule.BenhAn.BenhAnThuong;
import ThiModule.BenhAn.BenhAnVip;
import ThiModule.Exception.NotFoundMedicalRecordException;
import ThiModule.Regex.Regex;
import ThiModule.Regex.Valid;
import ThiModule.Service.MedicalSerVice;

import java.text.ParseException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static Regex regex = new Regex();
    static Scanner scanner = new Scanner(System.in);
    static MedicalSerVice medicalSerVice = new MedicalSerVice();

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("1.Them Moi");
            System.out.println("2.Xoa");
            System.out.println("3.Xem danh sach cac benh an");
            System.out.println("4.Thoat");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    themVao();
                    break;
                case 2:
                    xoa();
                    break;
                case 3:
                    hienThi();
                    break;
                case 4:
                    FileHelper.writeFileCSV("src\\ThiModule\\testfile.csv",medicalSerVice.findAll(),false);
                    break;
                case 5:
                    sort();
                    break;
            }
        } while (choose != 4);
    }

    public static int getChoice() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        String choose;
        do {
            choose = scanner.nextLine();
        } while (!Valid.isNumber(choose));
        return Integer.parseInt(choose);
    }

    public static void themVao() {
        System.out.println("1.Benh Nhan Thuong\n2.Benh Nhan Vip");
        int choose = getChoice();
        System.out.println("Ma Benh An :");
        String maBenhAn = regex.checkBA(scanner.nextLine());
        System.out.println("Ma Benh Nhan: ");
        String maBenhNhan = regex.checkBN(scanner.nextLine());
        System.out.println("Nhap Ten Benh Nhan: ");
        String name = scanner.nextLine();
        System.out.println("Ngay Nhap vien: ");
        String dataNhapVien = regex.checkDate(scanner.nextLine());
        System.out.println("Ngay ra vien :");
        String dataRaVien;
        dataRaVien = regex.checkDate(scanner.nextLine());
        while (Valid.checkDay(dataNhapVien, dataRaVien) == -1) {
            System.out.println("Ngay ra vien phai lon hon ngay nhap vien");
            dataRaVien = regex.checkDate(scanner.nextLine());
        }
        System.out.println("Ly do nhap vien:");
        String lyDoNhapVien = scanner.nextLine();
        if (choose == 1) {
            String price;
            do {
                System.out.println("Phi nam vien");
                price = scanner.nextLine();
            } while (!Valid.isNumber(price));
            BenhAnThuong benhNhanThuong = new BenhAnThuong(0, maBenhAn, maBenhNhan, name, dataNhapVien, dataRaVien, lyDoNhapVien, Double.parseDouble(price));
            medicalSerVice.addBenhAn(benhNhanThuong);
            System.out.println("Add success");
        } else {
            String vip = null;
            boolean check = true;
            System.out.println("Loai Vip:\n1.Vip 1\n2.Vip 2\n3.Vip 3");
            while (check) {
                switch (getChoice()) {
                    case 1:
                        vip = "Vip 1";
                        check = false;
                        break;
                    case 2:
                        vip = "Vip 2";
                        check = false;
                        break;
                    case 3:
                        check = false;
                        vip = "Vip 3";
                        break;
                    default:
                        System.out.println("Chon tu 1 -3 :");

                }
            }
            System.out.println("Thoi Han Vip:");
            String thoiHanVip = regex.checkDate(scanner.nextLine());
            BenhAnVip benhAnVip = new BenhAnVip(0, maBenhAn, maBenhNhan, name, dataNhapVien, dataRaVien, lyDoNhapVien, vip, thoiHanVip);
            medicalSerVice.addBenhAn(benhAnVip);
            System.out.println("Add success");
        }
    }

    public static void hienThi() {
        List<BenhAn> benhAnList = medicalSerVice.findAll();
        if (!benhAnList.isEmpty()) {
            for (BenhAn benhAn : benhAnList) {
                System.out.println(benhAn);
            }
        } else {
            System.err.println("List is empty");
        }
    }

    public static void xoa() {
        boolean tmp = false;
        do {
            System.out.println(tmp ? "please you enter choice again :" : "enter Ma Benh An you want to delete:");
            try {
                String id = scanner.nextLine();
                medicalSerVice.delete(id);
                hienThi();
                tmp = false;
            } catch (NotFoundMedicalRecordException e) {
                System.err.println(e.getMessage());
                tmp = true;
            }
        } while (tmp);
    }
    public static void sort(){
        Collections.sort(medicalSerVice.findAll(), new Comparator<BenhAn>() {
            @Override
            public int compare(BenhAn o1, BenhAn o2) {
                return o1.getMaBenhAn().compareTo(o2.getMaBenhAn());
            }
        });


    }
}

