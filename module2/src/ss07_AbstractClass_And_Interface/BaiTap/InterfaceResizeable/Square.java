package ss07_AbstractClass_And_Interface.BaiTap.InterfaceResizeable;

import ss06_Inheritance.ThucHanh.HeCacDoiTuongHinhHoc.LopSquare;

public class Square extends LopSquare implements Resizeable {

    public Square(double Width) {
        super(Width);
    }

    public Square() {
    }

    @Override
    public void resize(double percent) {
        System.out.println("Size Square: " + this.getArea());
        System.out.println("Percent Square: " + percent);
        System.out.println("Resize Square: " + this.getArea() * percent / 100);
    }
}
