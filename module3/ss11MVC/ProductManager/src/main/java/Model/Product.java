package Model;

public class Product {
    private int id;
    private String ten;
    private String nhaSanXuat;

    public Product() {
    }

    public Product(int id, String ten, String nhaSanXuat) {
        this.id = id;
        this.ten = ten;
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
}
