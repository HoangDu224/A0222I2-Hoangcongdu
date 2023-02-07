package case_study.models;

public class Villa extends Facility {
    private String standard;
    private float sizeHoBoi;
    private int floor;

    public Villa() {
    }

    public Villa(String nameService, float size, float price, int people, String style, String standard, float sizeHoBoi, int floor) {
        super(nameService, size, price, people, style);
        this.standard = standard;
        this.sizeHoBoi = sizeHoBoi;
        this.floor = floor;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public float getSizeHoBoi() {
        return sizeHoBoi;
    }

    public void setSizeHoBoi(float sizeHoBoi) {
        this.sizeHoBoi = sizeHoBoi;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "standard='" + standard + '\'' +
                ", sizeHoBoi=" + sizeHoBoi +
                ", floor=" + floor +
                ", nameService='" + nameService + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", people=" + people +
                ", style='" + style + '\'' +
                '}';
    }
}
