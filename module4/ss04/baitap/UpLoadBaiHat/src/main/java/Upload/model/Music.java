package Upload.model;

public class Music {
    private String tenBaiHat;
    private String caSi;
    private String theLoai;
    private String linkFile;

    public Music() {
    }

    public Music(String tenBaiHat, String caSi, String theLoai, String linkFile) {
        this.tenBaiHat = tenBaiHat;
        this.caSi = caSi;
        this.theLoai = theLoai;
        this.linkFile = linkFile;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    public String getLinkFile() {
        return linkFile;
    }

    public void setLinkFile(String linkFile) {
        this.linkFile = linkFile;
    }
}
