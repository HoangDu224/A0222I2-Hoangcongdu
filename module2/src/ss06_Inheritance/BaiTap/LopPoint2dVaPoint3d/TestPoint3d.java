package ss06_Inheritance.BaiTap.LopPoint2dVaPoint3d;

public class TestPoint3d {
    public static void main(String[] args) {
        LopPoint3d point3d1 = new LopPoint3d(3, 4, 5);
        for (int i = 0; i < point3d1.getXYZ().length; i++) {
            System.out.println(point3d1.getXYZ()[i]);
        }
        System.out.println(point3d1);
    }
}
