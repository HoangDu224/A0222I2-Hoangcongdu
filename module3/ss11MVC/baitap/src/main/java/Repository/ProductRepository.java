package Repository;

import Model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    List<Product> productList = new ArrayList<>();
    {
        productList.add(new Product(1 , "XiaoMi1","XiaoMi"));
        productList.add(new Product(2 , "XiaoMi1","XiaoMi"));
        productList.add(new Product(3 , "XiaoMi1","XiaoMi"));
        productList.add(new Product(4 , "XiaoMi1","XiaoMi"));
    }
    public boolean add(Product product){
        return productList.add(product);
    }
    public boolean deleteById(int id){
        for (Product product: productList){
            if (product.getId() == id){
                productList.remove(product);
                return true;
            }
        }
        return false;
    }
    public Product displayByID(int id){
        for (Product product: productList){
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }
    public void editbyId(){

    }
    public List<Product> findAll(){
        // kết nối database để lấy dữ liệu
        return productList;
    }

}
