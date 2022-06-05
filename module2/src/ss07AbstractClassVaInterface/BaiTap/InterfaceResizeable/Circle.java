package ss07AbstractClassVaInterface.BaiTap.InterfaceResizeable;

import ss06KeThua.ThucHanh.HeCacDoiTuongHinhHoc.LopCircle;

public class Circle extends LopCircle implements Resizeable {
    public Circle(double radius) {
        super(radius);
    }

    public Circle() {
    }

    @Override
    public void resize(double percent) {
        System.out.println("Size Circle: "+this.getArea());
        System.out.println("Percent Circle: "+percent);
        System.out.println("Resize Circle: "+this.getArea()*percent/100);
    }
}
