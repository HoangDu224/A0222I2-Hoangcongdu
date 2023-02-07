package Repository;

import Model.Customer;

import java.util.List;

public interface ICustomerRepository {
    public void Add(Customer customer);
    public void Delete( int id);
    public List<Customer> findAll();
    public void Edit(Customer customer);
    public List<Customer> Search(String searchName, String searchPhone, String searchDiachi);
}
