package ss07AbstractClassVaInterface.BaiTap.InterfaceResizeable;

import ss06KeThua.ThucHanh.HeCacDoiTuongHinhHoc.LopRectangle;
import ss06KeThua.ThucHanh.HeCacDoiTuongHinhHoc.LopShade;

public class TestResizeable {
    public static void main(String[] args) {
        LopShade[] shapes = new LopShade[3];
        shapes[0] = new Circle(5);
        shapes[1] =  new Rectangle(2, 5);
        shapes[2] = new Square(20);
        for (LopShade shape: shapes) {
            if(shape instanceof Circle) {
                Circle c1 = (Circle)shape;
                c1.resize(50);
            } else if(shape instanceof LopRectangle) {
                Rectangle r1 = (Rectangle) shape;
                r1.resize(50);
            } else {
                Square s1 = (Square) shape;
                s1.resize(50);
            }
        }
    }
}
