package ss06_Inheritance.ThucHanh.HeCacDoiTuongHinhHoc;

public class LopCircle extends LopShade{
    private double radius = 1.0;
    public LopCircle(){
    }
    public LopCircle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public LopCircle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }
}
