package QuanLyDienThoai.Model;

public class AuthPhone extends Phone {
    private String TimeBaoHanh;
    private int IdBaoHanh;

    public AuthPhone() {
    }

    public AuthPhone(int id, String name, int price, String product, String timeBaoHanh, int idBaoHanh) {
        super(id, name, price, product);
        TimeBaoHanh = timeBaoHanh;
        IdBaoHanh = idBaoHanh;
    }

    public String getTimeBaoHanh() {
        return TimeBaoHanh;
    }

    public void setTimeBaoHanh(String timeBaoHanh) {
        TimeBaoHanh = timeBaoHanh;
    }

    public int getIdBaoHanh() {
        return IdBaoHanh;
    }

    public void setIdBaoHanh(int idBaoHanh) {
        IdBaoHanh = idBaoHanh;
    }
}
