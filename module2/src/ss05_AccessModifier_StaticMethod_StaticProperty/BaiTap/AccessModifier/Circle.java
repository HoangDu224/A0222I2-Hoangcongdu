package ss05_AccessModifier_StaticMethod_StaticProperty.BaiTap.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return radius * radius * 3.14;
    }
}
