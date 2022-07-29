package ss06_Inheritance.practice.HeCacDoiTuongHinhHoc;

public class LopRectangle extends LopShade {
    private double width = 1.0;
    private double height = 1.0;

    public LopRectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = length;
    }

    public LopRectangle(double width, double length) {
        this.width = width;
        this.height = length;
    }

    public LopRectangle() {
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return height;
    }

    public void setLength(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * this.height;
    }

    public double getPerimeter() {
        return 2 * (width + this.height);
    }

    @Override
    public String toString() {
        return "A Rectangle with width="
                + getWidth()
                + " and length="
                + getLength()
                + ", which is a subclass of "
                + super.toString();
    }
}

