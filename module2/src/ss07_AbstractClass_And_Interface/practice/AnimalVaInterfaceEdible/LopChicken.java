package ss07_AbstractClass_And_Interface.practice.AnimalVaInterfaceEdible;

public class LopChicken extends LopAnimal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck";
    }

    @Override
    public String howToEat() {
        return "Chicken: could be fried";
    }
}
