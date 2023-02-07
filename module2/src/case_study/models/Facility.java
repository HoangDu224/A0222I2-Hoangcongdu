package case_study.models;

public abstract class Facility {
    public String nameService;
    public float size;
    public float price;
    public int people;
    public String style;

    public Facility(String nameService, float size, float price, int people, String style) {
        this.nameService = nameService;
        this.size = size;
        this.price = price;
        this.people = people;
        this.style = style;
    }

    public Facility() {
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "nameService='" + nameService + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", people=" + people +
                ", style='" + style + '\'' +
                '}';
    }
}
