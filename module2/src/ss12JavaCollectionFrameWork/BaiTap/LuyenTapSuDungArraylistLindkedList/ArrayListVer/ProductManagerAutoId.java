package ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.ArrayListVer;

import ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.Product;
import ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.ProductAutoID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ProductManagerAutoId {
    Scanner scan = new Scanner(System.in);
    int id =0;
    ArrayList<ProductAutoID> listProduct = new ArrayList();
    public void addProduct(String name , int price){
        listProduct.add(new ProductAutoID(name,price));

    }
    public void display(){
        for (int i =0 ; i<listProduct.size();i++){
            System.out.println(listProduct.get(i));
        }
    }
    public void editById(int Id){
        boolean flag = false;
        for (int i =0 ; i<listProduct.size();i++){
            if(listProduct.get(i).getId() == Id ){
                System.out.println("Name Edit :");
                String name = scan.nextLine();
                System.out.println("Price Edit :");
                int price = scan.nextInt();
                listProduct.get(i).setPrice(price);
                listProduct.get(i).setName(name);
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println("Id not found");
        }
    }
    public void deleteById(int Id){
        boolean flag = false;
        for (int i =0 ; i<listProduct.size();i++){
            if(listProduct.get(i).getId() == Id ){
                listProduct.remove(i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Id not found");
        }
    }
    public Object searchByName(String name){
        for (int i =0 ; i<listProduct.size();i++){
            if(listProduct.get(i).getName().equals(name)){
                return listProduct.get(i);
            }
        }
        return null;
    }
    public void sortTangDan(){
        Collections.sort(listProduct, new Comparator<ProductAutoID>() {
            @Override
            public int compare(ProductAutoID o1, ProductAutoID o2) {
                return  o1.getPrice() - o2.getPrice();
            }
        });
    }
    public void sortGiamDan(){
        Collections.sort(listProduct, new Comparator<ProductAutoID>() {
            @Override
            public int compare(ProductAutoID o1, ProductAutoID o2) {
                return  o1.getPrice() < o2.getPrice()? 1 : -1;
            }
        });
    }

}
