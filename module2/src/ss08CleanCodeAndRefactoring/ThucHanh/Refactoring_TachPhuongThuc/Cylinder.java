package ss08CleanCodeAndRefactoring.ThucHanh.Refactoring_TachPhuongThuc;

public class Cylinder {
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius, 2, Math.PI);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }

    private static double getBaseArea(int radius) {
        return getPerimeter(radius, Math.PI, radius);
    }

    private static double getPerimeter(int radius, double i, double pi) {
        return i * pi * radius;
    }
}
