package ThiModule.BenhAn;

import java.util.Date;

public class BenhAnThuong extends BenhAn {
    int price;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int stt, String maBenhAn, String maBenhNhan, String name, String dateNhapVien, String dateRaVien, String lyDo, int price) {
        super(stt, maBenhAn, maBenhNhan, name, dateNhapVien, dateRaVien, lyDo);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BenhAnThuong{" +
                "stt=" + stt +
                " id=" + maBenhAn +
                ", name='" + name + '\'' +
                ", dateNhapVien='" + dateNhapVien + '\'' +
                ", dateRaVien='" + dateRaVien + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", price=" + price +
                '}';
    }
}
