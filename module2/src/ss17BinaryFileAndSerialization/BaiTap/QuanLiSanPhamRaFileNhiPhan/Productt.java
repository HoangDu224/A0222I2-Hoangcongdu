package ss17BinaryFileAndSerialization.BaiTap.QuanLiSanPhamRaFileNhiPhan;

import java.io.Serializable;

public class Productt implements Serializable{
    private String name;
    private int price;
    private String production;
    private int ID;

    public Productt(String name, int price, String production, int ID) {
        this.name = name;
        this.price = price;
        this.production = production;
        this.ID = ID;
    }

    public Productt(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Productt{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", production='" + production + '\'' +
                ", ID=" + ID +
                '}';
    }
}