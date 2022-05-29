package ss06KeThua.BaiTap.LopCircleVaCylinder;

public class LopCylinder extends LopCircle{
    public double h ;

    public LopCylinder(double radius, String color, double h) {
        super(radius, color);
        this.h = h;
    }
    public double getV(){
        return radius*radius*h*3.14;
    }

    @Override
    public String toString() {
        return "LopCylinder{" +
                "h=" + h +
                ", radius=" + radius +
                ", color='" + color +
                ",Area='"+getV()+'\'' +
                '}';
    }
}
