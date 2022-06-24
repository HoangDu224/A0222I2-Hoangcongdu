package ss12JavaCollectionFrameWork.BaiTap.LuyenTapSuDungArraylistLindkedList;

public class ProductAutoID{
    public String name;
    public int Id;
    public int price;

    public ProductAutoID() {
    }

    public ProductAutoID(String name, int price) {
        this.name = name;
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
