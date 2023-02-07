package Model;

public class PhongTro {
    private int id ;
    private String tenNguoi;
    private int dienthoai;
    private String ngayBatDau;
    private String hinhThuc;
    private String ghiChu;

    public PhongTro() {
    }

    public PhongTro(int id, String tenNguoi, int dienthoai, String ngayBatDau, String hinhThuc, String ghiChu) {
        this.id = id;
        this.tenNguoi = tenNguoi;
        this.dienthoai = dienthoai;
        this.ngayBatDau = ngayBatDau;
        this.hinhThuc = hinhThuc;
        this.ghiChu = ghiChu;
    }

    public PhongTro(String tenNguoi, int dienthoai, String ngayBatDau, String hinhThuc) {
        this.tenNguoi = tenNguoi;
        this.dienthoai = dienthoai;
        this.ngayBatDau = ngayBatDau;
        this.hinhThuc = hinhThuc;
    }

    public PhongTro(String tenNguoi, int dienthoai, String ngayBatDau, String hinhThuc, String ghiChu) {
        this.tenNguoi = tenNguoi;
        this.dienthoai = dienthoai;
        this.ngayBatDau = ngayBatDau;
        this.hinhThuc = hinhThuc;
        this.ghiChu = ghiChu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNguoi() {
        return tenNguoi;
    }

    public void setTenNguoi(String tenNguoi) {
        this.tenNguoi = tenNguoi;
    }

    public int getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(int dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getHinhThuc() {
        return hinhThuc;
    }

    public void setHinhThuc(String hinhThuc) {
        this.hinhThuc = hinhThuc;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
