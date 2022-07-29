package ss07_AbstractClass_And_Interface.BaiTap.InterfaceColorable;


import ss06_Inheritance.ThucHanh.HeCacDoiTuongHinhHoc.LopCircle;
import ss06_Inheritance.ThucHanh.HeCacDoiTuongHinhHoc.LopRectangle;
import ss06_Inheritance.ThucHanh.HeCacDoiTuongHinhHoc.LopShade;
import ss06_Inheritance.ThucHanh.HeCacDoiTuongHinhHoc.LopSquare;

public class Test {
    public static void main(String[] args) {
        LopShade[] shapes = new LopShade[3];
        shapes[0] = new LopCircle();
        shapes[1] = new LopSquare();
        shapes[2] = new LopRectangle();
        for (LopShade shape : shapes) {
            if (shape instanceof LopSquare) {
                Colorable squareColor = (Colorable) shape;
                squareColor.howToColor();
            }
        }
    }
}
