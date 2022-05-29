package ss06KeThua.BaiTap.LopCircleVaCylinder;

public class LopCircle {
    public double radius;
    public String color;

    public LopCircle() {
    }

    public LopCircle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    private double getArea(){
        return radius*radius*3.14;
    }

    @Override
    public String toString() {
        return "LopCircle{" +
                "radius=" + radius +
                ", color='" + color +
                ",V='"+getArea()+'\'' +
                '}';
    }
}
