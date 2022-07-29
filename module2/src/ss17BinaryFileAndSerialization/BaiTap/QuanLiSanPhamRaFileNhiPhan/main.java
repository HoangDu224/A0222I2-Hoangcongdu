package ss17BinaryFileAndSerialization.BaiTap.QuanLiSanPhamRaFileNhiPhan;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Productt p1 = new Productt("xiaomi", 1000, "xiaomi", 1);
        ProductManager productManager = new ProductManager();
        productManager.add(p1);
//        writeToFile("src\\ss17BinaryFileAndSerialization\\BaiTap\\QuanLiSanPhamRaFileNhiPhan\\text.txt",productManager.getListProductt());
        System.out.println(readFile("src\\ss17BinaryFileAndSerialization\\BaiTap\\QuanLiSanPhamRaFileNhiPhan\\text.txt"));

    }

    public static void writeToFile(String filepath, List<Productt> producttList) {
        try {
            FileOutputStream fos = new FileOutputStream(filepath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(producttList);
            fos.close();
            oos.close();
        } catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static List<Productt> readFile(String filepath) {
        try {
            FileInputStream fis = new FileInputStream(filepath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Productt> producttList = (List<Productt>) ois.readObject();
            fis.close();
            ois.close();
            return producttList;

        } catch (IOException | ClassNotFoundException e) {
            e.getStackTrace();
        }
        return Collections.EMPTY_LIST;
    }
}