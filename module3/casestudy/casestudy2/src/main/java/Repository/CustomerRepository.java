package Repository;

import Model.BaseRepository;
import Model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private final String SELECT_ALL = "select * from Customer;";
    private final String INSERT_CUSTOMER = "insert into customer ( customer_type_id,customer_name,customer_birthday ,customer_gender ,customer_id_card ,customer_phone ,customer_email ,customer_address)" +
            " values ( ?,?,?,?,?,?,?,?);";
    private final String DELETE_CUSTOMER = " delete from customer where customer_id = ?;";
    private final String DISABLE_FOREIGN_CHECK = "SET FOREIGN_KEY_CHECKS=0;";
    private final String UPDATE_CUSTOMER = "update customer set customer_type_id = ? , customer_name = ? , customer_birthday = ? , " +
            "customer_gender = ?, customer_id_card = ?, customer_phone = ?, customer_email = ?, customer_address = ? where customer_id = ?";
    private final String SEARCH_CUSTOMER = " select * from customer where customer_name like ? and customer_phone like ?  and customer_address like ? ;";

    @Override
    public void Add(Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareCall(INSERT_CUSTOMER);
            pr.setInt(1, customer.getCustomer_type_id());
            pr.setString(2, customer.getCustomer_name());
            pr.setDate(3, Date.valueOf(customer.getCustomer_birthday()));
            pr.setBoolean(4, customer.getCustomer_gender());
            pr.setInt(5, Integer.parseInt(customer.getCustomer_id_card()));
            pr.setInt(6, Integer.parseInt(customer.getCustomer_phone()));
            pr.setString(7, customer.getCustomer_email());
            pr.setString(8, customer.getCustomer_address());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void Delete(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement prr = connection.prepareCall(DISABLE_FOREIGN_CHECK);
            prr.executeUpdate();
            PreparedStatement pr = connection.prepareCall(DELETE_CUSTOMER);
            pr.setInt(1, id);
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> findAll() {
        Connection connection = BaseRepository.getConnectDB();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int typeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String date = resultSet.getString("customer_birthday");
                Boolean gender = resultSet.getString("customer_gender").equals("1");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customerList.add(new Customer(id, typeId, name, date, gender, idCard, phone, email, address));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void Edit(Customer customer) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareCall(UPDATE_CUSTOMER);
            pr.setInt(1, customer.getCustomer_type_id());
            pr.setString(2, customer.getCustomer_name());
            pr.setDate(3, Date.valueOf(customer.getCustomer_birthday()));
            pr.setBoolean(4, customer.getCustomer_gender());
            pr.setInt(5, Integer.parseInt(customer.getCustomer_id_card()));
            pr.setInt(6, Integer.parseInt(customer.getCustomer_phone()));
            pr.setString(7, customer.getCustomer_email());
            pr.setString(8, customer.getCustomer_address());
            pr.setInt(9, customer.getCustomer_id());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> Search(String searchName, String searchPhone, String searchDiachi) {
        Connection connection = BaseRepository.getConnectDB();
        List<Customer> customerList = new ArrayList<>();
        try {
            PreparedStatement pr = connection.prepareStatement(SEARCH_CUSTOMER);
            pr.setString(1,"%"+searchName+"%");
            pr.setString(2,"%"+searchPhone+"%");
            pr.setString(3,"%"+searchDiachi+"%");
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_id");
                int typeId = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_name");
                String date = resultSet.getString("customer_birthday");
                Boolean gender = resultSet.getString("customer_gender").equals("1");
                String idCard = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                customerList.add(new Customer(id, typeId, name, date, gender, idCard, phone, email, address));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }
}
