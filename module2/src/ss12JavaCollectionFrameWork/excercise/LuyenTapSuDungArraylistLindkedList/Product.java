package ss12JavaCollectionFrameWork.excercise.LuyenTapSuDungArraylistLindkedList;

public class Product {
    public String name;
    public int Id;
    public int price;

    public Product() {
    }

    public Product(String name, int id, int price) {
        this.name = name;
        Id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", price=" + price +
                '}';
    }

}
