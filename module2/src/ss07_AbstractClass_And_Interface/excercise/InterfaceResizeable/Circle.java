package ss07_AbstractClass_And_Interface.excercise.InterfaceResizeable;

import ss06_Inheritance.practice.HeCacDoiTuongHinhHoc.LopCircle;

public class Circle extends LopCircle implements Resizeable {
    public Circle(double radius) {
        super(radius);
    }

    public Circle() {
    }

    @Override
    public void resize(double percent) {
        System.out.println("Size Circle: " + this.getArea());
        System.out.println("Percent Circle: " + percent);
        System.out.println("Resize Circle: " + this.getArea() * percent / 100);
    }
}
