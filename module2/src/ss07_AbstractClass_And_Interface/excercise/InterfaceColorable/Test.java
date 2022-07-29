package ss07_AbstractClass_And_Interface.excercise.InterfaceColorable;


import ss06_Inheritance.practice.HeCacDoiTuongHinhHoc.LopCircle;
import ss06_Inheritance.practice.HeCacDoiTuongHinhHoc.LopRectangle;
import ss06_Inheritance.practice.HeCacDoiTuongHinhHoc.LopShade;
import ss06_Inheritance.practice.HeCacDoiTuongHinhHoc.LopSquare;

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
