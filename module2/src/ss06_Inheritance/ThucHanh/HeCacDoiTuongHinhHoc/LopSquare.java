package ss06_Inheritance.ThucHanh.HeCacDoiTuongHinhHoc;

import ss07_AbstractClass_And_Interface.BaiTap.InterfaceColorable.Colorable;

public class LopSquare extends LopRectangle implements Colorable {
        double Width;
        public LopSquare(double side, String color, boolean filled) {
            super(side, side, color, filled);
        }

        public LopSquare() {
        }
        public LopSquare(double Width){
            this.Width = Width;
        }

        public double getSide() {
            return getWidth();
        }

        public void setSide(double side) {
            setWidth(side);
            setLength(side);
        }
        public double getArea(){
            return Width*Width;
        }
        @Override
        public void setWidth(double width) {
            setSide(width);
        }

        @Override
        public void setLength(double length) {
            setSide(length);
        }

        @Override
        public String toString() {
            return "A Square with side="
                    + getSide()
                    + ", which is a subclass of "
                    + super.toString();
        }

        @Override
        public void howToColor() {
            System.out.println("Color all four side");
        }
    }
