package scan.repository;

import org.springframework.stereotype.Repository;
import scan.model.Product;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
   static   List<Product> productList = new ArrayList<>();
    static {
        productList.add(new Product(1,"product1","10000","aaaa","product"));
        productList.add(new Product(2,"product1","10000","aaaa","product"));
        productList.add(new Product(3,"product1","10000","aaaa","product"));
    }
    public List<Product> findAll(){
        return productList;
    }
    public void deleteProductById(int id){
        for (int i = 0;i<productList.size();i++){
            if (productList.get(i).getId()==id){
                productList.remove(i);
            }
        }
    }
    public Product findById(int id){
        for (int i = 0;i<productList.size();i++){
            if (productList.get(i).getId()==id){
                return productList.get(i);
            }
        }
        return null;
    }
    public void addProduct(Product product){
        if (product.getId()==0){
            if (productList.isEmpty()){
                product.setId(1);
            }
            product.setId(productList.get(productList.size()-1).getId()+1);
        }
        productList.add(product);
    }
    public Product findByName(String name){
        for (int i = 0;i<productList.size();i++){
            if (name.equals(productList.get(i).getName())){
                return productList.get(i);
            }
        }
        return null;
    }
}
