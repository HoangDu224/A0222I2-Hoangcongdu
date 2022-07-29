package ss05_AccessModifier_StaticMethod_StaticProperty.ThucHanh.StaticProperty;

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
