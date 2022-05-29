package ss06KeThua.BaiTap.LopPoint2dVaPoint3d;

import java.lang.reflect.Array;

public class LopPoint2d {
    public float x,y;

    public LopPoint2d() {
    }

    public LopPoint2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x =  x;
        this.y = y ;
    }
    public float[] getXY(){
        float[] arr = new float[2];
        return  arr= new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "LopPoint2d{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
