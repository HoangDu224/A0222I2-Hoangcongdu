package QuanLyDienThoai.View;

import QuanLyDienThoai.Exception.NotFoundException;
import QuanLyDienThoai.Model.AuthPhone;
import QuanLyDienThoai.Model.HandPhone;
import QuanLyDienThoai.Model.Phone;
import QuanLyDienThoai.Service.PhoneService;

import java.util.List;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static PhoneService phoneService = new PhoneService();
    public static void main(String[] args) {
            int choose;
            do {
                System.out.println("1.Hien Thi");
                System.out.println("2.Them Vao");
                System.out.println("3.Xoa");
                System.out.println("4.Tim kiem theo ten");
                System.out.println("5.Thoat");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:hienThi();
                        break;
                    case 2:themVao();
                        break;
                    case 3:xoa();
                        break;
                    case 4:timKiemTheoTen();
                        break;
                    case 5:
                        break;
                }
            } while (choose != 5);
        }
    public static int getChoice() throws NumberFormatException  {
        Scanner scanner = new Scanner(System.in);
        try {
        int choose = Integer.parseInt(scanner.nextLine());
        return choose;
        }catch (NumberFormatException e){
            throw new NumberFormatException(e.getMessage());
        }
    }
    public static void themVao(){
        System.out.println("1.AuthPhone\n2.HandPhone");
        int choose = getChoice();
        System.out.println("Nhap name: ");
        String name = scanner.nextLine();
        System.out.println("Nhap Hang san xuat :");
        String product = scanner.nextLine();
        System.out.println("Nhap gia:");
        int price = Integer.parseInt(scanner.nextLine());
        if (choose == 1){
            System.out.println("Nhap Time bao hanh");
            String timeBaoHanh = scanner.nextLine();
            System.out.println("Nhap Id bao hanh");
            int idBaoHanh = Integer.parseInt(scanner.nextLine());
            AuthPhone authPhone = new AuthPhone(0, name, price, product, timeBaoHanh, idBaoHanh);
            phoneService.addPhone(authPhone);
        }else {
            System.out.println("Nhap country:");
            String country = scanner.nextLine();
            System.out.println("Nhap status:");
            String status = scanner.nextLine();
            HandPhone handPhone = new HandPhone(0, name, price, product, country, status);
            phoneService.addPhone(handPhone);
        }
        System.out.println("Created successfully");
    }
    public static void hienThi(){
        List<Phone> phones = phoneService.findAll();
        if (!phones.isEmpty()){
        for (Phone phone : phones){
            System.out.println(phone);
        }
        }else {
            System.err.println("List is empty");
        }
    }
    public static void xoa() {
        boolean tmp = false;
        do {
        hienThi();
        System.out.println(tmp ? "please you enter choice again :":"enter id you want to delete:");
        try{
            int id = Integer.parseInt(scanner.nextLine());
        phoneService.delete(id);
        System.out.println("Deleted successfully");
        tmp = false;
        }catch (NumberFormatException | NotFoundException e){
            System.err.println(e.getMessage());
            tmp = true;
        }
        }while (tmp);
    }
    public static void timKiemTheoTen(){
        System.out.println("Nhap ten can tim kiem:");
        String nameInput = scanner.nextLine();
        System.out.println(phoneService.searchByName(nameInput));
    }
}