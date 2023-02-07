package ThiLai.service;


import ThiLai.Exception.NotFoundProductException;
import ThiLai.File_Helper.FileSP;
import ThiLai.model.SanPham;
import ThiModule.Exception.NotFoundMedicalRecordException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {
    Scanner scan = new Scanner(System.in);
    private static FileSP fileSP = new FileSP();
    public static List<SanPham> productList = new ArrayList<>();
    static int id = 1;
    private final static String PATH = "src\\ThiLai\\Data\\products.csv";

    public ProductService() {
        productList = fileSP.readFileCSV(PATH);
    }

    public static void addSanPham(SanPham sanPham) {
        productList.add(sanPham);
        productList.get(productList.size() - 1).setId(id++);
    }

    public List<SanPham> findAll() {
        return productList;
    }

    public void delete(String Id) throws NotFoundProductException {
        for (SanPham sanPham : productList) {
            if (sanPham.getMaSanPham().equals(Id)) {
                System.out.println("Yes or no:");
                String choose = scan.nextLine();
                if (choose.equals("yes") || choose.equals("Yes")) {
                    productList.remove(sanPham);
                    fileSP.writeFileCSV(PATH,productList,false);
                    return;
                } else {
                    return;
                }
            }
        }
        throw new NotFoundProductException("San Pham Khong Tim Thay:");
    }
}

