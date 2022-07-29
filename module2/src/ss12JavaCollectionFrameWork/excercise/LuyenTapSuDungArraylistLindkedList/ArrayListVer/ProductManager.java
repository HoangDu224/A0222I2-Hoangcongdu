package ss12JavaCollectionFrameWork.excercise.LuyenTapSuDungArraylistLindkedList.ArrayListVer;

import ss12JavaCollectionFrameWork.excercise.LuyenTapSuDungArraylistLindkedList.Product;

import java.util.*;

public class ProductManager {
    Scanner scan = new Scanner(System.in);
    ArrayList<Product> listProduct = new ArrayList();

    public void add(Product product) {
        listProduct.add(new Product(product.getName(), product.getId(), product.getPrice()));
    }

    public void addProduct(String name, int id, int price) {
        listProduct.add(new Product(name, id, price));
    }

    public void display() {
        for (int i = 0; i < listProduct.size(); i++) {
            System.out.println(listProduct.get(i));
        }
    }

    public List getListProductt() {
        return listProduct;
    }

    public void editById(int Id) {
        boolean flag = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == Id) {
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
        if (!flag) {
            System.out.println("Id not found");
        }
    }

    public void deleteById(int Id) {
        boolean flag = false;
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == Id) {
                listProduct.remove(i);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Id not found");
        }
    }

    public Object searchByName(String name) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getName().equals(name)) {
                return listProduct.get(i);
            }
        }
        return null;
    }

    public void sortTangDan() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

    public void sortGiamDan() {
        Collections.sort(listProduct, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice() < o2.getPrice() ? 1 : -1;
            }
        });
    }

}

