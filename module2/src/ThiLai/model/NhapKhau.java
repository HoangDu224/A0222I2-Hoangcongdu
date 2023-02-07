package ThiLai.model;

public class NhapKhau extends SanPham {
    private float priceNhapKhau;
    private String tinhThanhNhap;
    private float thueNhapKhau;

    public NhapKhau() {
    }

    public NhapKhau(int id, String maSanPham, String tenSanPham, float price, float soLuong, String nhaSanXuat, float priceNhapKhau, String tinhThanhNhap, float thueNhapKhau) {
        super(id, maSanPham, tenSanPham, price, soLuong, nhaSanXuat);
        this.priceNhapKhau = priceNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public void getInfo() {
        System.out.println(priceNhapKhau);
        System.out.println(tinhThanhNhap);
        System.out.println(thueNhapKhau);
    }

    public float getPriceNhapKhau() {
        return priceNhapKhau;
    }

    public void setPriceNhapKhau(float priceNhapKhau) {
        this.priceNhapKhau = priceNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public float getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(float thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "NhapKhau{" +
                "id=" + id +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", price=" + price +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                ",  priceNhapKhau=" + priceNhapKhau +
                ", tinhThanhNhap='" + tinhThanhNhap + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }
}
