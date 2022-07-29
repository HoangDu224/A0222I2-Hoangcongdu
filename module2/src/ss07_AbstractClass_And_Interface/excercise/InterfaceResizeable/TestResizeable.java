package ss07_AbstractClass_And_Interface.excercise.InterfaceResizeable;

import ss06_Inheritance.practice.HeCacDoiTuongHinhHoc.LopShade;

public class TestResizeable {
    public static void main(String[] args) {
        LopShade[] shapes = new LopShade[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(2, 5);
        shapes[2] = new Square(5);
        for (LopShade shape : shapes) {
            if (shape instanceof Circle) {
                Circle c1 = (Circle) shape;
                c1.resize(50);
            } else if (shape instanceof Rectangle) {
                Rectangle r1 = (Rectangle) shape;
                r1.resize(50);
            } else {
                Square s1 = (Square) shape;
                s1.resize(50);
            }
        }
    }
}
