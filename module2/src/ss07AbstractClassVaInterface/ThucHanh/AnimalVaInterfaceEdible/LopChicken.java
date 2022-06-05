package ss07AbstractClassVaInterface.ThucHanh.AnimalVaInterfaceEdible;

public class LopChicken extends LopAnimal implements Edible {
    @Override
    public String makeSound(){
        return "Chicken: cluck-cluck";
    }
    @Override
    public String howToEat() {
        return "Chicken: could be fried";
}
}
