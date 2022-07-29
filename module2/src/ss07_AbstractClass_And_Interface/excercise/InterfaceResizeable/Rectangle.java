package ss07_AbstractClass_And_Interface.excercise.InterfaceResizeable;

import ss06_Inheritance.practice.HeCacDoiTuongHinhHoc.LopRectangle;

public class Rectangle extends LopRectangle implements Resizeable {
    public Rectangle(double width, double length) {
        super(width, length);
    }

    @Override
    public void resize(double percent) {
        System.out.println("Size Rectangle: " + this.getArea());
        System.out.println("Percent Rectangle: " + percent);
        System.out.println("Resize Rectangle: " + this.getArea() * percent / 100);
    }
}
