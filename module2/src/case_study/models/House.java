package case_study.models;

public class House extends Facility {
    private String standard;
    private int floor;

    public House() {
    }

    public House(String nameService, float size, float price, int people, String style, String standard, int floor) {
        super(nameService, size, price, people, style);
        this.standard = standard;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "House{" +
                "standard='" + standard + '\'' +
                ", floor=" + floor +
                ", nameService='" + nameService + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", people=" + people +
                ", style='" + style + '\'' +
                '}';
    }
}
