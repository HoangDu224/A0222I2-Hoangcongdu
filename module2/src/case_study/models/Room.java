package case_study.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String nameService, float size, float price, int people, String style, String freeService) {
        super(nameService, size, price, people, style);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", size=" + size +
                ", price=" + price +
                ", people=" + people +
                ", style='" + style + '\'' +
                '}';
    }
}
