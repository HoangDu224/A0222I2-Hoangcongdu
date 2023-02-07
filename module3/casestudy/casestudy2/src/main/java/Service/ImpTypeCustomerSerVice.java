package Service;

import Repository.TypeCustomerRepository;

import java.util.List;

public class ImpTypeCustomerSerVice implements ITypeCustomer {
    TypeCustomerRepository typeCustomerRepository = new TypeCustomerRepository();
    @Override
    public List<Model.TypeCustomer> findAll() {
        return typeCustomerRepository.findAll();
    }
}
