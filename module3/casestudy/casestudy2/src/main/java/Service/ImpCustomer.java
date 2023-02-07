package Service;

import Model.Customer;
import Repository.CustomerRepository;

import java.util.List;

public class ImpCustomer implements ICustomer {
    CustomerRepository customerRepository = new CustomerRepository();
    @Override
    public void Add(Customer customer) {
        customerRepository.Add(customer);
    }

    @Override
    public void Delete( int id) {
        customerRepository.Delete(id);
    }

    @Override
    public List<Customer> findAll() {
      return  customerRepository.findAll();
    }

    @Override
    public void Edit(Customer customer) {
        customerRepository.Edit(customer);
    }

    @Override
    public List<Customer> Search(String searchName , String searchPhone, String searchDiachi) {
        return customerRepository.Search(searchName,searchPhone,searchDiachi);
    }
}
