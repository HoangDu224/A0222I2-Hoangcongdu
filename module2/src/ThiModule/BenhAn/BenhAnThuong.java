package ThiModule.BenhAn;

public class BenhAnThuong extends BenhAn {
    double price;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int stt, String maBenhAn, String maBenhNhan, String name, String dateNhapVien, String dateRaVien, String lyDo, double price) {
        super(stt, maBenhAn, maBenhNhan, name, dateNhapVien, dateRaVien, lyDo);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "stt=" + stt +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", name='" + name + '\'' +
                ", dateNhapVien='" + dateNhapVien + '\'' +
                ", dateRaVien='" + dateRaVien + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", price=" + price +
                '}';
    }
}
