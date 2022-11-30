package scan.model;

public class ToKhai {
    private String hoTen;
    private String namSinh;
    private String gioiTinh;
    private String quocTich;
    private String soCMND;
    private String diChuyen;
    private String soHieu;
    private String soGhe;
    private String ngayKhoiHanh;
    private String ngayKetThuc;
    private String lichSuDiLai;
    private String diaChi;
    private String dienThoai;
    private String email;
    private String trieuChung;

    public ToKhai() {
    }

    public ToKhai(String hoTen, String namSinh, String gioiTinh, String quocTich, String soCMND, String diChuyen, String soHieu, String soGhe, String ngayKhoiHanh, String ngayKetThuc, String lichSuDiLai, String diaChi, String dienThoai, String email, String trieuChung) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.quocTich = quocTich;
        this.soCMND = soCMND;
        this.diChuyen = diChuyen;
        this.soHieu = soHieu;
        this.soGhe = soGhe;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.ngayKetThuc = ngayKetThuc;
        this.lichSuDiLai = lichSuDiLai;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
        this.trieuChung = trieuChung;
    }

    public ToKhai(String hoTen, String namSinh, String gioiTinh, String quocTich, String soCMND, String ngayKhoiHanh, String ngayKetThuc, String lichSuDiLai, String diaChi, String dienThoai, String email, String trieuChung) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.quocTich = quocTich;
        this.soCMND = soCMND;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.ngayKetThuc = ngayKetThuc;
        this.lichSuDiLai = lichSuDiLai;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.email = email;
        this.trieuChung = trieuChung;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getDiChuyen() {
        return diChuyen;
    }

    public void setDiChuyen(String diChuyen) {
        this.diChuyen = diChuyen;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public String getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(String soGhe) {
        this.soGhe = soGhe;
    }

    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getLichSuDiLai() {
        return lichSuDiLai;
    }

    public void setLichSuDiLai(String lichSuDiLai) {
        this.lichSuDiLai = lichSuDiLai;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTrieuChung() {
        return trieuChung;
    }

    public void setTrieuChung(String trieuChung) {
        this.trieuChung = trieuChung;
    }
}
