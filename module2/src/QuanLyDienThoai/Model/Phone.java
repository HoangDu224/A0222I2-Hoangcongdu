package QuanLyDienThoai.Model;

public class Phone {
    public int id;
    public String name;
    public int price;
    public String product;

    public Phone() {
    }

    public Phone(int id, String name, int price, String product) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", product='" + product + '\'' +
                '}';
    }
}
