package Repository;

import Model.BaseRepository;
import Model.PhongTro;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PhongRepository {
    private final String SELECT_ALL = "select * from phongtro;";
    private final String SEARCH_PHONGTRO = " select * from phongtro where maphongtro like ? and tennguoi like ?  and sodienthoai like ? ;";
    private final String INSERT_PHONGTRO = "insert into phongtro ( tennguoi , sodienthoai, ngaybatdau , hinhthucthanhtoan, ghichu)" +
            " values ( ?,?,?,?,?);";
    private final String DELETE_PHONG = " delete from phongtro where maphongtro = ?;";
    public List<PhongTro> findAll() {
        Connection connection = BaseRepository.getConnectDB();
        List<PhongTro> phongTroList = new ArrayList<>();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("maphongtro");
                String tenNguoi = resultSet.getString("tennguoi");
                int phone = resultSet.getInt("sodienthoai");
                String ngay = resultSet.getString("ngaybatdau");
                String hinhThuc = resultSet.getString("hinhthucthanhtoan");
                String ghiChu = resultSet.getString("ghichu");
                phongTroList.add(new PhongTro(id, tenNguoi, phone, ngay, hinhThuc, ghiChu));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return phongTroList;
    }

    public List<PhongTro> Search(String searchName, String searchPhone, String searchMa) {
        Connection connection = BaseRepository.getConnectDB();
        List<PhongTro> phongTroList = new ArrayList<>();
        try {
            PreparedStatement pr = connection.prepareStatement(SEARCH_PHONGTRO);
            pr.setString(1, "%" + searchMa + "%");
            pr.setString(2, "%" + searchName + "%");
            pr.setString(3, "%" + searchPhone + "%");
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("maphongtro");
                String tenNguoi = resultSet.getString("tennguoi");
                int phone = resultSet.getInt("sodienthoai");
                String ngay = resultSet.getString("ngaybatdau");
                String hinhThuc = resultSet.getString("hinhthucthanhtoan");
                String ghiChu = resultSet.getString("ghichu");
                phongTroList.add(new PhongTro(id, tenNguoi, phone, ngay, hinhThuc, ghiChu));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return phongTroList;
    }

    public void Add(PhongTro phongTro) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareCall(INSERT_PHONGTRO);
            pr.setString(1, phongTro.getTenNguoi());
            pr.setInt(2, phongTro.getDienthoai());
            pr.setDate(3, Date.valueOf(phongTro.getNgayBatDau()));
            pr.setString(4, phongTro.getHinhThuc());
            pr.setString(5, phongTro.getGhiChu());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void Delete(int id) {
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareCall(DELETE_PHONG);
            pr.setInt(1, id);
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
