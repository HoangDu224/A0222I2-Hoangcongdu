package ss07AbstractClassVaInterface.BaiTap.InterfaceColorable;


import ss06KeThua.ThucHanh.HeCacDoiTuongHinhHoc.LopCircle;
import ss06KeThua.ThucHanh.HeCacDoiTuongHinhHoc.LopRectangle;
import ss06KeThua.ThucHanh.HeCacDoiTuongHinhHoc.LopShade;
import ss06KeThua.ThucHanh.HeCacDoiTuongHinhHoc.LopSquare;

public class Test {
    public static void main(String[] args) {
        LopShade[] shapes =  new LopShade[3];
        shapes[0] = new LopCircle();
        shapes[1] = new LopSquare();
        shapes[2] = new LopRectangle();
        for (LopShade shape: shapes) {
            if(shape instanceof LopSquare) {
                Colorable squareColor = (Colorable) shape;
                squareColor.howToColor();
            }
        }
    }
}
