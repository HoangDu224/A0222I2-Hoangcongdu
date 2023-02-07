package ThiLai.model;

public class XuatKhau extends SanPham {
    private float priceXuatKhau;
    private String countryXuatKhau;

    public XuatKhau() {
    }

    @Override
    public void getInfo() {
        System.out.println(priceXuatKhau);
        System.out.println(countryXuatKhau);
    }

    public XuatKhau(int id, String maSanPham, String tenSanPham, float price, float soLuong, String nhaSanXuat, float priceXuatKhau, String countryXuatKhau) {
        super(id, maSanPham, tenSanPham, price, soLuong, nhaSanXuat);
        this.priceXuatKhau = priceXuatKhau;
        this.countryXuatKhau = countryXuatKhau;
    }

    public float getPriceXuatKhau() {
        return priceXuatKhau;
    }

    public void setPriceXuatKhau(float priceXuatKhau) {
        this.priceXuatKhau = priceXuatKhau;
    }

    public String getCountryXuatKhau() {
        return countryXuatKhau;
    }

    public void setCountryXuatKhau(String countryXuatKhau) {
        this.countryXuatKhau = countryXuatKhau;
    }

    @Override
    public String toString() {
        return "XuatKhau{" +
                "id=" + id +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", price=" + price +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                ", priceXuatKhau=" + priceXuatKhau +
                ", countryXuatKhau='" + countryXuatKhau + '\'' +
                '}';
    }
}
