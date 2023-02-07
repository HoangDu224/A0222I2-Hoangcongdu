package Repository;

import Model.TypeCustomer;

import java.util.List;

public interface ITypeCustomerRepository {
    public List<TypeCustomer> findAll();
}
