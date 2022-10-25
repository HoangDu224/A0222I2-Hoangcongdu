package Service;

import Model.Product;
import Repository.ProductRepository;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    ProductRepository productRepository = new ProductRepository();
    public boolean add(Product product){
       return productRepository.add(product);
    }
    public boolean deleteById(int id){
        return productRepository.deleteById(id);
    }
    public Product displayByID(int id){
        return productRepository.displayByID(id);
    }
    public void editbyId(){

    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }


}
