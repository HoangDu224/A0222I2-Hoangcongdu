package ss06_Inheritance.BaiTap.LopPointVaMoveablePoint;

public class LopPoint {
    public float x,y;

    public LopPoint() {
    }

    public LopPoint(float x, float y) {
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
        this.x = x;
        this.y = y;
    }
    public float [] getXY (){
        float arr[] = new float[2];
        return arr = new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "LopPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
