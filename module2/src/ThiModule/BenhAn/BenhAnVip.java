package ThiModule.BenhAn;

import java.util.Date;

public class BenhAnVip extends BenhAn {
    String vip;
    String thoiHanVip;

    public String getVip() {
        return vip;
    }

    public void setVip(String vip) {
        this.vip = vip;
    }

    public String getThoiHanVip() {
        return thoiHanVip;
    }

    public void setThoiHanVip(String thoiHanVip) {
        this.thoiHanVip = thoiHanVip;
    }

    public BenhAnVip() {
    }

    public BenhAnVip(int stt, String maBenhAn, String maBenhNhan, String name, String dateNhapVien, String dateRaVien, String lyDo, String vip, String thoiHanVip) {
        super(stt, maBenhAn, maBenhNhan, name, dateNhapVien, dateRaVien, lyDo);
        this.vip = vip;
        this.thoiHanVip = thoiHanVip;
    }

    @Override
    public String toString() {
        return "BenhAnVip{" +
                "stt=" + stt +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", name='" + name + '\'' +
                ", dateNhapVien='" + dateNhapVien + '\'' +
                ", dateRaVien='" + dateRaVien + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", vip='" + vip + '\'' +
                ", thoiHanVip='" + thoiHanVip + '\'' +
                '}';
    }
}
