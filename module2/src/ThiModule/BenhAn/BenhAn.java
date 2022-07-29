package ThiModule.BenhAn;

import java.util.Date;

public abstract class BenhAn {
    int stt;
    String maBenhAn;
    String maBenhNhan;
    String name;
    String dateNhapVien;
    String dateRaVien;
    String lyDo;

    public BenhAn() {
    }

    public BenhAn(int stt, String maBenhAn, String maBenhNhan, String name, String dateNhapVien, String dateRaVien, String lyDo) {
        this.stt = stt;
        this.maBenhAn = maBenhAn;
        this.maBenhNhan = maBenhNhan;
        this.name = name;
        this.dateNhapVien = dateNhapVien;
        this.dateRaVien = dateRaVien;
        this.lyDo = lyDo;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateNhapVien() {
        return dateNhapVien;
    }

    public void setDateNhapVien(String dateNhapVien) {
        this.dateNhapVien = dateNhapVien;
    }

    public String getDateRaVien() {
        return dateRaVien;
    }

    public void setDateRaVien(String dateRaVien) {
        this.dateRaVien = dateRaVien;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "stt=" + stt +
                ", maBenhAn='" + maBenhAn + '\'' +
                ", maBenhNhan='" + maBenhNhan + '\'' +
                ", name='" + name + '\'' +
                ", dateNhapVien='" + dateNhapVien + '\'' +
                ", dateRaVien='" + dateRaVien + '\'' +
                ", lyDo='" + lyDo + '\'' +
                '}';
    }
}
