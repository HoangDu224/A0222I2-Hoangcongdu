package ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.LinkedListVer;

import ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList.Product;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListProductManager {
    Scanner scan = new Scanner(System.in);
    LinkedList<Product> linkedListProduct = new LinkedList<>();
    public void addProduct(String name ,int id , int price){
        linkedListProduct.add(new Product(name,id,price));
    }
    public void display(){
        for (int i =0 ; i<linkedListProduct.size();i++){
            System.out.println(linkedListProduct.get(i));
        }
    }
    public void editById(int Id){
        boolean flag = false;
        for (int i =0 ; i<linkedListProduct.size();i++){
            if(linkedListProduct.get(i).getId() == Id ){
                System.out.println("Name Edit :");
                String name = scan.nextLine();
                System.out.println("Price Edit :");
                int price = scan.nextInt();
                linkedListProduct.get(i).setPrice(price);
                linkedListProduct.get(i).setName(name);
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
        for (int i =0 ; i<linkedListProduct.size();i++){
            if(linkedListProduct.get(i).getId() == Id ){
                linkedListProduct.remove(i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("Id not found");
        }
    }
    public Object searchByName(String name){
        for (int i =0 ; i<linkedListProduct.size();i++){
            if(linkedListProduct.get(i).getName().equals(name)){
                return linkedListProduct.get(i);
            }
        }
        return null;
    }
    public void sort(boolean a){
        if (a){
        Collections.sort(linkedListProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return  o1.getPrice() - o2.getPrice();
//        Collections.sort(linkedListProduct, (o1, o2) -> o1.getPrice() - o2.getPrice());
//        Collections.sort(linkedListProduct, Comparator.comparing(Product::getPrice));
            }
        });
        }else {
            Collections.sort(linkedListProduct, Comparator.comparing(Product::getPrice).reversed());
        }
    }

}

