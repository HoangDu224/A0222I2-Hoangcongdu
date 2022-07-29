package QuanLyDienThoai.Model;

public class HandPhone extends Phone {
    private String country;
    private String status;

    public HandPhone() {
    }

    public HandPhone(int id, String name, int price, String product, String country, String status) {
        super(id, name, price, product);
        this.country = country;
        this.status = status;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
