package Repository;

import Model.BaseRepository;
import Model.TypeCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeCustomerRepository implements ITypeCustomerRepository {
    private final String SELECT_ALL = "SELECT * FROM customer_type;";

    @Override
    public List<TypeCustomer> findAll() {
        List<TypeCustomer> typeCustomerList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("customer_type_id");
                String type = resultSet.getString("customer_type_name");
                typeCustomerList.add(new TypeCustomer(id,type));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return typeCustomerList;
    }
}
