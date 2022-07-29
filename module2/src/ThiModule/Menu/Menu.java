package ThiModule.Menu;

import QuanLyDienThoai.Exception.NotFoundException;
import QuanLyDienThoai.Model.Phone;
import ThiModule.BenhAn.BenhAn;
import ThiModule.BenhAn.BenhAnThuong;
import ThiModule.BenhAn.BenhAnVip;
import ThiModule.Exception.NotFoundMedicalRecordException;
import ThiModule.Service.MedicalSerVice;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Menu {
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
                    break;
            }
        } while (choose != 4);
    }

    public static int getChoice() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        int choose = Integer.parseInt(scanner.nextLine());
        return choose;
    }

    public static void themVao() {
        System.out.println("1.Benh Nhan Thuong\n2.Benh Nhan Vip");
        int choose = getChoice();
        System.out.println("Ma Benh An :");
        String maBenhAn = scanner.nextLine();
        System.out.println("Ma Benh Nhan: ");
        String maBenhNhan = scanner.nextLine();
        System.out.println("Nhap Ten Benh Nhan: ");
        String name = scanner.nextLine();
        System.out.println("Ngay Nhap vien: ");
        String dataNhapVien = scanner.nextLine();
        System.out.println("Ngay ra vien :");
        String dataRaVien = scanner.nextLine();
        System.out.println("Ly do nhap vien:");
        String lyDoNhapVien = scanner.nextLine();
        if (choose == 1) {
            System.out.println("Phi nam vien");
            int price = Integer.parseInt(scanner.nextLine());
            BenhAnThuong benhNhanThuong = new BenhAnThuong(0, maBenhAn, maBenhNhan, name, dataNhapVien, dataRaVien, lyDoNhapVien, price);
            medicalSerVice.addBenhAn(benhNhanThuong);
        } else {
            String vip;
            System.out.println("Loai Vip:\n1.Vip 1\n2.Vip 2\nVip 3");
            switch (getChoice()) {
                case 1:
                    vip = "Vip 1";
                    break;
                case 2:
                    vip = "Vip 2";
                    break;
                case 3:
                    vip = "Vip 3";
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + getChoice());
            }
            System.out.println("Thoi Han Vip:");
            String thoiHanVip = scanner.nextLine();
            BenhAnVip benhAnVip = new BenhAnVip(0, maBenhAn, maBenhNhan, name, dataNhapVien, dataRaVien, lyDoNhapVien, vip, thoiHanVip);
            medicalSerVice.addBenhAn(benhAnVip);
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
}

