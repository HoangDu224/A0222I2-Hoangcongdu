package ss07AbstractClassVaInterface.ThucHanh.InterfaceComparableSoSanh;

import ss06KeThua.ThucHanh.HeCacDoiTuongHinhHoc.LopCircle;

public class ComparableCircle extends LopCircle implements Comparable<ComparableCircle>{
    public ComparableCircle(String color, boolean filled, double radius) {
        super(color, filled, radius);
    }
    public ComparableCircle() {
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()) return 1;
        else if (getRadius() < o.getRadius()) return -1;
        else return 0;
    }
}