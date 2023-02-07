package repository;

import model.BaseRepository;
import model.TheMuonSach;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TheMuonSachRepository {
    private final String INSERT_MUONSACH = "insert into themuonsach (mamuonsach,masach,mahocsinh,trangthai,ngaymuon,ngaytra)" +
            "values (?,?,?,?,?,?)";
    private final String SELECT_MUONSACH = "SELECT * FROM themuonsach;";
    public void insertThe(TheMuonSach theMuonSach){
        Connection connection = BaseRepository.getConnectDB();
        try {
            PreparedStatement pr = connection.prepareStatement(INSERT_MUONSACH);
            pr.setString(1,theMuonSach.getMaMuonSach());
            pr.setInt(2,theMuonSach.getMaSach());
            pr.setInt(3,theMuonSach.getMaHocSinh());
            pr.setBoolean(4,false);
            pr.setDate(5, Date.valueOf(theMuonSach.getNgayMuon()));
            pr.setDate(6,Date.valueOf(theMuonSach.getNgayTra()));
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public List<TheMuonSach> findAll(){
        Connection connection = BaseRepository.getConnectDB();
        List<TheMuonSach> theMuonSachList = new ArrayList<>();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_MUONSACH);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                String maMuonSach = resultSet.getString("mamuonsach");
                int tenSach = Integer.parseInt(resultSet.getString("masach"));
                int tenHocsinh = Integer.parseInt(resultSet.getString("mahocsinh"));
                String ngaymuon = resultSet.getString("ngaymuon");
                String ngaytra = resultSet.getString("ngaytra");
                Boolean trangthai = resultSet.getBoolean("trangthai");
                theMuonSachList.add(new TheMuonSach(maMuonSach,tenSach,tenHocsinh,trangthai,ngaymuon,ngaytra));

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return theMuonSachList;
    }
}
