package ss06_Inheritance.excercise.LopPoint2dVaPoint3d;

public class TestPoint2d {
    public static void main(String[] args) {
        LopPoint2d point1 = new LopPoint2d(3, 5);
        for (int i = 0; i < point1.getXY().length; i++) {
            System.out.println(point1.getXY()[i]);
        }
        System.out.println(point1);
    }
}
