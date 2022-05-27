package ss05AccessModifierStaticMethodStaticProperty.ThucHanh.StaticProperty;

public class LopCar {
    private String name;

    private String engine;

    public static int numberOfCars;

    public LopCar(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }


}
