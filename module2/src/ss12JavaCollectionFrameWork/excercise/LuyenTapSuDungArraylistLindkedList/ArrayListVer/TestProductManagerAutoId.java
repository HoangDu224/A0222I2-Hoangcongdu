package ss12JavaCollectionFrameWork.excercise.LuyenTapSuDungArraylistLindkedList.ArrayListVer;

import java.util.Scanner;

public class TestProductManagerAutoId {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ProductManagerAutoId product = new ProductManagerAutoId();
        boolean check = true;
        while (check) {
            System.out.println("1.Thêm sản phẩm");
            System.out.println("2.Sửa thông tin sản phẩm theo id");
            System.out.println("3.Xoá sản phẩm theo id");
            System.out.println("4.Hiển thị danh sách sản phẩm");
            System.out.println("5.Tìm kiếm sản phẩm theo tên");
            System.out.println("6.Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("0.Exit");
            int choose = Integer.parseInt(scan.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Nhap gia san pham");
                    int price = Integer.parseInt(scan.nextLine());
                    System.out.println("Nhap ten san pham");
                    String name = scan.nextLine();
                    product.addProduct(name, price);
                    break;
                case 2:
                    System.out.println("Nhap Id san pham de sua");
                    int id = Integer.parseInt(scan.nextLine());
                    product.editById(id);
                    break;
                case 3:
                    System.out.println("Nhap Id san pham de xoa");
                    int deleteId = Integer.parseInt(scan.nextLine());
                    product.deleteById(deleteId);
                case 4:
                    product.display();
                    break;
                case 5:
                    System.out.println("Nhap ten can tim");
                    String nameSearch = scan.nextLine();
                    product.searchByName(nameSearch);
                    break;
                case 6:
                    System.out.println("1.Sort tang dan");
                    System.out.println("2.Sort giam dan");
                    int sort = Integer.parseInt(scan.nextLine());
                    switch (sort) {
                        case 1:
                            product.sortTangDan();
                            break;
                        case 2:
                            product.sortGiamDan();
                            break;
                    }
                    break;
                case 0:
                    check = false;
            }
        }

    }
}
