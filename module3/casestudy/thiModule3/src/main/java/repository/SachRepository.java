package repository;

import model.BaseRepository;
import model.Sach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SachRepository {
    private final String SELECT_ALL = "select * from sach;";

    public List<Sach> findAll() {
        Connection connection = BaseRepository.getConnectDB();
        List<Sach> sachList = new ArrayList<>();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int maSach = resultSet.getInt("masach");
                String tenSach = resultSet.getString("tensach");
                String tacGia = resultSet.getString("tacgia");
                String moTa = resultSet.getString("mota");
                int soLuong = resultSet.getInt("soluong");
                sachList.add(new Sach(maSach,tenSach,tacGia,moTa,soLuong));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return sachList;
    }
}
