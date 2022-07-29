package ss06_Inheritance.excercise.LopPoint2dVaPoint3d;

public class LopPoint3d extends LopPoint2d {
    public float z;

    public LopPoint3d(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public LopPoint3d() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = new float[3];
        return arr = new float[]{this.x, this.y, this.z};
    }

    @Override
    public String toString() {
        return "LopPoint3d{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
