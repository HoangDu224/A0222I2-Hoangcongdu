package ss05_AccessModifier_StaticMethod_StaticProperty.ThucHanh.StaticProperty;

public class TestStaticProperty {
    public static void main(String[] args) {
        LopCar car1 = new LopCar("Mazda 3", "Skyactiv 3");

        System.out.println(LopCar.numberOfCars);

        LopCar car2 = new LopCar("Mazda 6", "Skyactiv 6");

        System.out.println(LopCar.numberOfCars);
    }
}
