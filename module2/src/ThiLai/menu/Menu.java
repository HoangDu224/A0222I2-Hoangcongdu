package ThiLai.menu;

import ThiLai.Exception.NotFoundProductException;
import ThiLai.File_Helper.FileSP;
import ThiLai.model.NhapKhau;
import ThiLai.model.SanPham;
import ThiLai.model.XuatKhau;
import ThiLai.service.ProductService;
import ThiModule.Regex.Regex;
import ThiModule.Regex.Valid;


import java.util.List;
import java.util.Scanner;

public class Menu {
    private static FileSP fileSP = new FileSP();
    static Regex regex = new Regex();
    static Scanner scanner = new Scanner(System.in);
    static ProductService productService = new ProductService();

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("1.Them Moi");
            System.out.println("2.Xoa");
            System.out.println("3.Xem danh sach cac San Pham");
            System.out.println("4.Tim Kiem");
            System.out.println("5. Thoat");
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
                    timKiem();
                    break;
                case 5:
                    break;
            }
        } while (choose != 5);
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
        System.out.println("1.San Pham Xuat Khau\n2.San Pham Nhap Khau");
        int choose = getChoice();
        System.out.println("Ma San Pham :");
        String maSanPham = scanner.nextLine();
        while (!regex.checkSpace(maSanPham)) {
            System.out.println("Nhap sai :");
            maSanPham = scanner.nextLine();
        }
        System.out.println("Ten San Pham : ");
        String tenSanPham = scanner.nextLine();
        while (!regex.checkSpace(tenSanPham)) {
            System.out.println("Nhap sai :");
            tenSanPham = scanner.nextLine();
        }
        System.out.println("Gia Ban : ");
        String price = scanner.nextLine();
        while (!Valid.isNumber(price) || Float.parseFloat(price) <= 0) {
            System.out.println("Nhap sai :");
            price = scanner.nextLine();
        }

        System.out.println("So Luong : ");
        String soLuong = scanner.nextLine();
        while (!Valid.isNumber(soLuong) || Float.parseFloat(price) <= 0) {
            System.out.println("Nhap sai :");
            soLuong = scanner.nextLine();
        }
        System.out.println("Nha San Xuat :");
        String nhaSanXuat = scanner.nextLine();
        if (choose == 1) {
            String giaXuatKhau;
            do {
                System.out.println("Gia Xuat Khau :");
                giaXuatKhau = scanner.nextLine();
            } while (!Valid.isNumber(giaXuatKhau) || Float.parseFloat(price) <= 0);
            System.out.println("Quoc Gia nhap san pham :");
            String country = scanner.nextLine();
            while (!regex.checkSpace(country)) {
                System.out.println("Nhap sai :");
                country = scanner.nextLine();
            }
            XuatKhau xuatKhau = new XuatKhau(0, maSanPham, tenSanPham, Float.parseFloat(price),
                    Float.parseFloat(soLuong), nhaSanXuat, Float.parseFloat(giaXuatKhau), country);
            ProductService.addSanPham(xuatKhau);
            System.out.println("Add success");
            fileSP.writeFileCSV("src\\ThiLai\\Data\\products.csv", productService.findAll(), false);
        } else {
            String giaNhapKhau;
            do {
                System.out.println("Gia Nhap Khau :");
                giaNhapKhau = scanner.nextLine();
            } while (!Valid.isNumber(giaNhapKhau) || Float.parseFloat(price) <= 0);
            System.out.println("Tinh Thanh Nhap :");
            String tinhThanhNhap = scanner.nextLine();
            while (!regex.checkSpace(tinhThanhNhap)) {
                System.out.println("Nhap sai :");
                tinhThanhNhap = scanner.nextLine();
            }
            String thueNhapKhau;
            do {
                System.out.println("Thue Nhap Khau :");
                thueNhapKhau = scanner.nextLine();
            } while (!Valid.isNumber(thueNhapKhau) || Float.parseFloat(price) <= 0);
            NhapKhau nhapKhau = new NhapKhau(0, maSanPham, tenSanPham, Float.parseFloat(price),
                    Float.parseFloat(soLuong), nhaSanXuat, Float.parseFloat(giaNhapKhau), tinhThanhNhap,
                    Float.parseFloat(thueNhapKhau));
            ProductService.addSanPham(nhapKhau);
            System.out.println("Add success");
            fileSP.writeFileCSV("src\\ThiLai\\Data\\products.csv", productService.findAll(), false);
        }
    }

    public static void hienThi() {
        List<SanPham> productS = productService.findAll();
        if (!productS.isEmpty()) {
            for (SanPham sanPham : productS) {
                System.out.println(sanPham);
            }
        } else {
            System.err.println("List is empty");
        }
    }

    public static void xoa() {
        boolean tmp = false;
        do {
            System.out.println(tmp ? "please you enter choice again :" : "enter Ma san pham you want to delete:");
            try {
                String id = scanner.nextLine();
                if (tmp == true && id.equals("")) {
                    return;
                }
                productService.delete(id);
                hienThi();
                tmp = false;
            } catch (NotFoundProductException e) {
                System.err.println(e.getMessage());
                tmp = true;
            }
        } while (tmp);
    }

    public static void timKiem() {
        System.out.println("1. Tim kiem theo ma san pham");
        System.out.println("2. Tim kiem theo ten san pham");
        int choose = getChoice();
        hienThi();
        if (choose == 1) {
            boolean check = true;
            System.out.println("Nhap ma san pham");
            String key = scanner.nextLine();
            for (SanPham sanPham : productService.findAll()) {
                if (sanPham.getMaSanPham().equals(key)) {
                    System.out.println(sanPham);
                    check = false;
                }
            }
            if (check = true) {
                System.out.println("Khong Tim Thay San Pham: ");
            }
        } else {
            boolean check = true;
            System.out.println("Nhap ten san pham :");
            String key = scanner.nextLine();
            for (SanPham sanPham : productService.findAll()) {
                if (sanPham.getTenSanPham().equals(key)) {
                    System.out.println(sanPham);
                    check = false;
                }
            }
            if (check = true) {
                System.out.println("Khong Tim Thay San Pham: ");
            }
        }
    }
}
