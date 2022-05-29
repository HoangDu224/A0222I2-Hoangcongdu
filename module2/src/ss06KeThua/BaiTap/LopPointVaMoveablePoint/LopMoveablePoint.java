package ss06KeThua.BaiTap.LopPointVaMoveablePoint;

public class LopMoveablePoint extends LopPoint {
    public float xSpeed , ySpeed;

    public LopMoveablePoint() {
    }

    public LopMoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public LopMoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed (float xSpeed , float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float arr[] = new float[2];
        return arr = new float[]{this.xSpeed, this.ySpeed};
    }

    @Override
    public String toString() {
        return "LopMoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
    public LopMoveablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
