package repository;

import model.BaseRepository;
import model.HocSinh;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HocSinhRepository {
    private final String SELECT_ALL = "SELECT * FROM hocsinh;";

    public List<HocSinh> findAll() {
        List<HocSinh> hocSinhList = new ArrayList<>();
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int mahocsinh = resultSet.getInt("mahocsinh");
                String hoTen = resultSet.getString("hoten");
                String lop = resultSet.getString("lop");
                hocSinhList.add(new HocSinh(mahocsinh,hoTen,lop));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return hocSinhList;
    }
}
